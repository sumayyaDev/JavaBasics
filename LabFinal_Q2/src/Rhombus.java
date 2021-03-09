import java.util.*;
	public class Rhombus extends GeometricObject implements Cloneable {
		private double s;
		private double h;
		
		
	
		public Rhombus() {
			super();
		}

		public Rhombus(double S, double h) {
			super();
			try {
				if(s<0) {
					throw new IllegalArgumentException("IllegalArgumentException");
				}
				this.s = s;
				this.h = h;
			}
			catch(IllegalArgumentException ex) {
				System.out.println("IllegalArgumentException");
			}
		}
		
		public double getS() {
			return s;
		}

		public void setS(double s) {
			this.s = s;
		}

		public double getH() {
			return h;
		}

		public void setH(double h) {
			this.h = h;
		}
		@Override
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}

		@Override
		public double getArea() {
			double area = s * h;
			return area;
		}
	
		@Override
		public double getPerimeter() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String toString() {
			return "Rhombus [s=" + s + ", h=" + h + " + " +" area =" + getArea() + "]";
		}
		
		

}
