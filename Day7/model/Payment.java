package com.agro.kavya.model;
import static jakarta.persistence.GenerationType.UUID;        // import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.Id;
    import jakarta.persistence.JoinColumn;
    import jakarta.persistence.OneToOne;
    import jakarta.persistence.Table;
    import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    
    
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "payment")
    public class Payment {
        
        @Id
        @GeneratedValue(strategy = UUID)
        private String payment_id;
    
        // @Column(nullable = false)
        private Integer account_number;
        
        // @Column(nullable = false)
        private String ifsc_code;
        
        // @Column(nullable = false)
        private String email;
    
        @OneToOne
        @JoinColumn(name = "userLoanId", referencedColumnName = "userLoanId")
        private Userloan userLoan;
    }
