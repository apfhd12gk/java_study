package javaEx;
enum Direction {
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction[] DIR_ARR = Direction.values();
	private final int value;
	private final String symbol;
	
	Direction(int value,String sysmbol){
		this.value=value;
		this.symbol=sysmbol;
	}
	public int getValue() {return value;}
	public String getSymbol() {return symbol;}
	
	public static Direction of(int dir) {
		if(dir<1||dir>4) {
			throw new IllegalArgumentException("Invalid value : "+dir);
		}
		return DIR_ARR[dir-1];
	}
	public Direction rotate(int num) {
		num=num%4;
		if(num<0) num+=4; // 음수일 때 시계반대 방향으로 회전
		return DIR_ARR[(value-1+num)%4];
	}
	public String toString() {
		return name()+getSymbol();
	}
}


public class EnumTest {
	public static void main(String[] args) {
		for(Direction d : Direction.values())
			System.out.printf("%s=%d%n",d.name(),d.getValue());
		
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.of(1);
		// printf 는 %d %s 사용할떄 println은 괄호내용을 출력
		System.out.printf("d1=%s, %d\n",d1.name(),d1.getValue());
		System.out.printf("d1=%s, %d\n",d2.name(),d2.getValue());
		System.out.println(Direction.EAST.rotate(1));
		System.out.println(Direction.EAST.rotate(2));
		System.out.println(Direction.EAST.rotate(-1));
		System.out.println(Direction.EAST.rotate(-2));
		
	}

}
