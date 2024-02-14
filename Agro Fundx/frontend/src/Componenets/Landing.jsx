import React from 'react';
import '../assets/css/Landing.css';
import { Link } from 'react-router-dom';
import bv from '../assets/video/finance_-_93956 (Original).mp4';


function Landingpage() {
   
  return (
    <React.Fragment>
      <video autoPlay loop muted id = 'video' style={{position:"fixed",width:"100vw",zIndex:"-1"}}>
        <source src={bv} type='video/mp4'/>
      </video>

      <div className="hero-section">
        <h1>Crafting  </h1>
        <h1>Your Financial</h1>
        <h1>Success</h1>
        <h1>Story Together</h1>
        <p style={{color:"white"}}>Need we say more? <br />Come to <strong>AGRO FUNDX</strong> and have the time of your life.</p>

        <Link to={`/login`}><button style={{fontSize:'20px'}}>Get Started</button></Link>
      </div>
    </React.Fragment>
  );
}

export default Landingpage;