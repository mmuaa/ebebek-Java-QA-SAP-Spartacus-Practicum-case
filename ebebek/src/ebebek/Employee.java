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
	            double extraSalary = (extraTime * 30) * 4;
	            return extraSalary;
	        }else {
	        	return 0;
	        }
	    }
	    
	    public double raiseSalary(){
	    	double workYear = 2021 - hireYear;
	    	
	        if(workYear <10){
	            double raiseSalary = salary +(salary * 0.05);
	            return raiseSalary;
	        }else if(workYear >9 || workYear <20) {
	        	double raiseSalary = salary + (salary * 0.10);
	        	return raiseSalary;
	        }else{
	        	double raiseSalary = salary + (salary * 0.15);
	        	return raiseSalary;
	        }
	    }
	    
	    public void toString(String args[])
	    {
	    	System.out.print(""
	    			+ "Çalışan adı : "+name+"\n"
	    			+ "Çalışan maaşı : "+salary+"\n"
	    			+ "Çalışma saati : "+workHours+"\n"
	    			+ "Çalışmaya Başlama yılı : "+hireYear+"\n"
	    			+ "Çalışana uygulanan vergi : "+tax()+"\n"
	    			+ "Çalışanın bonus maaşı : "+bonus()+"\n"
	    			+ "Çalışanın toplam maaşı : "+(salary+bonus())+"\n"
	    			+ "Çalışanın net maaşı : "+(salary-tax()+bonus())+"\n"
	    			+ "Çalışanın zammı : "+raiseSalary());
	    }
	    
	    public static void main(String args[])
	    {
	    	Employee muharrem = new Employee("Muharrem",1000,40,2011);
	    	muharrem.toString(null);
	    }
}
