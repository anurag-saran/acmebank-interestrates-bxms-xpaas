package com.acme.dept.interestrates.acmebank_interestrates;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class interestratesDO implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "months")
   private java.lang.Integer months;
   @org.kie.api.definition.type.Label(value = "amount")
   private java.lang.Integer amount;
   @org.kie.api.definition.type.Label(value = "eate")
   private java.lang.Integer rate;

   public interestratesDO()
   {
   }

   public java.lang.Integer getMonths()
   {
      return this.months;
   }

   public void setMonths(java.lang.Integer months)
   {
      this.months = months;
   }

   public java.lang.Integer getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Integer amount)
   {
      this.amount = amount;
   }

   public java.lang.Integer getRate()
   {
      return this.rate;
   }

   public void setRate(java.lang.Integer rate)
   {
      this.rate = rate;
   }

   public interestratesDO(java.lang.Integer months, java.lang.Integer amount,
         java.lang.Integer rate)
   {
      this.months = months;
      this.amount = amount;
      this.rate = rate;
   }

}