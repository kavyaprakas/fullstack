package com.agro.kavya.model;
// import static jakarta.persistence.GenerationType.UUID;        // import jakarta.persistence.Column;
//     import jakarta.persistence.Entity;
//     import jakarta.persistence.GeneratedValue;
//     import jakarta.persistence.Id;
//     import jakarta.persistence.JoinColumn;
//     import jakarta.persistence.OneToOne;
//     import jakarta.persistence.Table;
//     import lombok.AllArgsConstructor;
//     import lombok.Builder;
//     import lombok.Data;
//     import lombok.NoArgsConstructor;
    
    
//     @Data
//     @Builder
//     @NoArgsConstructor
//     @AllArgsConstructor
//     @Entity
//     @Table(name = "payment")
//     public class Payment {
        
//         @Id
//         @GeneratedValue(strategy = UUID)
//         private String paymentId;
    
//         // @Column(nullable = false)
//         private Integer accountNumber;
        
//         // @Column(nullable = false)
//         private String ifscCode;
        
//         // @Column(nullable = false)
//         private String email;
//         private String status;
//         private String modeOfPayment;
        
    
//         @OneToOne
//         @JoinColumn(name = "userLoanId", referencedColumnName = "userLoanId")
//         private Userloan userLoan;
//     }




import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
// @Setter
public class Payment {

    @Id
    @Column(nullable = false)
    private String paymentId;

    @Column(nullable = false)
    private String bookingId;  

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String paymentDate;
    
    @Column(nullable = false)
    private String paymentMethod;
}