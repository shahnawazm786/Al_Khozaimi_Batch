package MulitpleInheritance;

public class BankCustomer implements IPersonalLoan,IHousingLoan,ICarLoan {

	
	public void CarLoan() {
		// TODO Auto-generated method stub
		
		System.out.println("Car Loan" + ICarLoan.interest);
	}

	public void HousingLoan() {
		// TODO Auto-generated method stub
		System.out.println("Housing Laon" + IHousingLoan.interest);
	}

	public void PersonalLoan() {
		// TODO Auto-generated method stub
		System.out.println("Personal Laon" + IPersonalLoan.interest);
	}

}
