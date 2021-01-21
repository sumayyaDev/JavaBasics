import java.util.Arrays;

public class Course {
	private String[] name;
	private int[] code;
	
	
	public Course() {
		super();
	}
	public Course(String[] name, int[] code) {
		super();
		this.name = name;
		this.code = code;
	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public int[] getCode() {
		return code;
	}
	
	public void setCode(int[] code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + Arrays.toString(name) + ", code=" + Arrays.toString(code) + "]";
	}
	
}
