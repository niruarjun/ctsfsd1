package comparable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
//public class Student implements Comparable<Student>
public class Student implements Comparable<Student>
{
	private int rollno=0;
	private String name;
	private double cgpa=0.0;
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int result=0;
		if(this.getCgpa()>o.getCgpa())
		{
			result=-1;
		}
		if(this.getCgpa()<o.getCgpa())
		{
			result=1;
		}
	 if(this.getCgpa()==o.getCgpa())
	 {
		 result=0;
	 }
		return result;
	}
	

}
