package ebebek;

public class Employee {
	 String name;
	 double salary;
	 int workHours;
	 int hireYear;

	 Employee(String name,double salary,int workHours,int hireYear){
	        this.name = name;
	        this.salary = salary;
	        this.workHours = workHours;
	        this.hireYear = hireYear;   
	    }
	 
	 
	 public double tax(){
	        if(salary >= 1000){
	            double newsalary = (salary * 0.03);
	            return newsalary;
	        }else{
	            return 0;
	        }
	    }
	    
	    public double bonus(){
	        if(workHours >= 40){
	            double extraTime = workHours-40;
	            double extraSalary = (extraTime * 30);
	            return extraSalary;
	        }else {
	        	return 0;
	        }
	    }
	    
	    public double raiseSalary(){
	    	double workYear = 2021 - hireYear;
	    	double raiseSalary = 0;
	    	
	    	if(workYear <10){
	            return raiseSalary = (salary * 0.05);
	        }else if(workYear >9 && workYear <20) {
	        	return raiseSalary = (salary * 0.10);
	        }else{
	        	return raiseSalary = (salary * 0.15);
	        }
	    }
	    
	    public void toString(String args[])
	    {
	    	System.out.print(""
                    + "Adı : "+name+"\n"
                    + "Maaşı : "+salary+"\n"
                    + "Çalışma saati : "+workHours+"\n"
                    + "Başlangıç yılı : "+hireYear+"\n"
                    + "Vergi : "+tax()+"\n"
                    + "Bonus : "+bonus()+"\n"
                    + "Maaş Artışı : "+raiseSalary()+"\n"
                    + "Vergi ve Bonuslar ile birlikte maaş : "+(salary-tax()+bonus())+"\n"
                    + "Toplam maaş : "+(salary+bonus()+raiseSalary()-tax())+"\n"
                    );
	    			
	    }
	    
	    public static void main(String args[])
        {
            Employee muharrem = new Employee("Muharrem",2000,45,1985);
            muharrem.toString(null);
        }
}
