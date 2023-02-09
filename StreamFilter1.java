package java8;

import java.util.ArrayList;
import java.util.List;

class Emp {

	int eid;
	String ename;
	int sal;

	public Emp(int id, String name, int Sal) {

		this.eid = id;
		this.ename = name;
		this.sal = Sal;

	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}

}

public class StreamFilter1 {

	public static void main(String[] args) {

		List<Emp> list = new ArrayList<>();

		list.add(new Emp(101, "Anil", 10000));
		list.add(new Emp(102, "dadus", 11000));
		list.add(new Emp(103, "MC", 12000));
		list.add(new Emp(104, "Pubg", 13000));
		list.add(new Emp(105, "Freefire", 14000));
		list.add(new Emp(109, "asasas", 9000));
		list.add(new Emp(106, "Harry", 15000));

// sal >=12000		 && id >=104
		list.stream().filter(o -> o.sal >= 12000 && o.eid >= 104).forEach(System.out::println);

	}

}
