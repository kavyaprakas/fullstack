// UserApply.jsx
import React, { useState } from 'react';
import NavBar from '../NavBar';
import sharedState from './SharedState';
import './UserApply.css';

const UserApply = () => {
  const [currentPage, setCurrentPage] = useState(1);
  const [status, setStatus] = useState(null);
  const [formData, setFormData] = useState({
    // Fields from the first page
    name: '',
    email: '',
    mobile: '',
    branch: '',
    scheme: sharedState.content,
    amount: '',
    purpose: '',

    // Additional fields for the second page
    panCard: '',
    salary: '',
    aadharNo: '',
    address: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevFormData) => ({
      ...prevFormData,
      [name]: value,
    }));
  };

  const handlePageChange = (page) => {
    setCurrentPage(page);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(formData.scheme);
    // Perform form submission logic here (e.g., API request)
    // For demonstration purposes, simulate a successful submission
    setStatus('Application submitted successfully!');
  };

  return (
    <div>
      <NavBar />
      <br /><br />
      <div className="agriculture-loan-container">
        <h2>Agriculture Loan - Page {currentPage}</h2>
        <form action="#" method="post" onSubmit={handleSubmit}>
          {currentPage === 1 && (
            <>
              {/* Fields for Page 1 */}
              <div className="form-row">
                <label htmlFor="name">FULL NAME:</label>
                <input type="text" id="name" name="name" value={formData.name} onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="email">EMAIL:</label>
                <input type="email" id="email" name="email" value={formData.email} onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="mobile">MOBILE NUMBER:</label>
                <input type="tel" id="mobile" name="mobile" pattern="[0-9]{10}" value={formData.mobile} onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="branch">BRANCH NAME: </label>
                <input type="text" id="branch" name="branch" value={formData.branch} onChange={handleChange} required />
              </div>

              <h5 style={{ color: 'red', paddingLeft: '400px' }}>
                *If you apply Loan Under Any scheme Please Specify Below
              </h5>

              <div className="form-row">
                <label htmlFor="scheme">SCHEME NAME: </label>
                <input type="text" id="scheme" name="scheme" value={formData.scheme} onChange={handleChange} />
              </div>

              <div className="form-row">
                <label htmlFor="amount">Loan Amount:</label>
                <input type="number" id="amount" name="amount" value={formData.amount} onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="purpose">Loan Purpose:</label>
                <select id="purpose" name="purpose" value={formData.purpose} onChange={handleChange} required>
                  <option value="" disabled>Select a purpose</option>
                  <option value="crop">Crop Cultivation</option>
                  <option value="equipment">Purchase Equipment</option>
                  <option value="land">Land Development</option>
                </select>
              </div>
            </>
          )}

          {currentPage === 2 && (
            <>
              {/* Fields for Page 2 */}
              <div className="form-row">
                <label htmlFor="panCard">PAN Card Number:</label>
                <input type="text" id="panCard" name="panCard" value={formData.panCard} onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="salary">Applicant Salary:</label>
                <input type="number" id="salary" name="salary" value={formData.salary} onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="aadharNo">Aadhar Number:</label>
                <input type="text" id="aadharNo" name="aadharNo" value={formData.aadharNo} onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="address">Address:</label>
                <textarea id="address" name="address" value={formData.address} onChange={handleChange} required />
              </div>
              <div className="form-row">
                <label htmlFor="document">Attach Document:</label>
                <input type="file" id="document" name="document" accept=".pdf, .doc, .docx" onChange={handleChange} required />
              </div>

              <div className="form-row">
                <label htmlFor="aadharPhoto">Attach Aadhar Photo:</label>
                <input type="file" id="aadharPhoto" name="aadharPhoto" accept="image/*" onChange={handleChange} required />
              </div>
            </>
          )}

          {currentPage==1&&(<div className="radio-buttons-container">
            <label>
              <input
                type="radio"
                id="page1"
                name="page"
                value={1}
                checked={currentPage === 1}
                onChange={() => handlePageChange(1)}
              />
              Page 1
            </label>

            <label>
              <input
                type="radio"
                id="page2"
                name="page"
                value={2}
                checked={currentPage === 2}
                onChange={() => handlePageChange(2)}
              />
              Page 2
            </label>
          </div>)}
          {currentPage==2&&(<div><div className="radio-buttons-container">
            <label>
              <input
                type="radio"
                id="page1"
                name="page"
                value={1}
                checked={currentPage === 1}
                onChange={() => handlePageChange(1)}
              />
              Page 1
            </label>

            <label>
              <input
                type="radio"
                id="page2"
                name="page"
                value={2}
                checked={currentPage === 2}
                onChange={() => handlePageChange(2)}
              />
              Page 2
            </label>
           
          </div>
            <br/><br/><br/>
           <button type="submit">Submit Application</button></div>)}

          
        </form>
        {status && <p>{status}</p>}
      </div>
    </div>
  );
};

export default UserApply;
