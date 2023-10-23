package hello;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int answer = random.nextInt(20) + 1;
		int attemps = 0;
		
		while (true) {
			System.out.println("정답을 추측하여 보시오:  ");
			int guess = scanner.nextInt();
			attemps++;
			
			if (guess < answer) {
				System.out.println("제시한 정수가 낮습니다.  ");
				
			} else if (guess > answer) {
				System.out.println("제시한 정수가 높습니다.  ");
			} else {
				System.out.println("축하합니다. 시도횟수=" + attemps);
				break;
			}
		}
		
		scanner.close();
	}
}






package hello;

public class solution {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 5;
		int c = 1000;
		
		int max = 100;
		
		boolean found = false;
		for (int x = 0; x <= max; x++) {
			for (int y = 0; y <= max; y++) {
				if(a * x + b * y == c) {
					System.out.println("(" + x + "," + y + ")" );
					found = true;
				}
			}
		}
	

	}

}



package hello;

import java.util.Scanner;

public class Temperature2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("============================");
		
		System.out.println("번호를 선택하시오:");
		int menu = scan.nextInt();
		
		if(menu == 1) {
			System.out.println("화씨온도를 입력하시오: ");
			
			int hwatmp = scan.nextInt();
			double seoptmp = (hwatmp - 32) / 1.8;
			
			System.out.println("섭씨온도는" + seoptmp);
		}
		else if(menu == 2) {
			System.out.println("섭씨온도를 입력하시오:");
			
			int seoptmp = scan.nextInt();
			double hwatmp = seoptmp * 1.8 + 32;
			
			System.out.println("화씨온도는 "  + hwatmp);
		} 
	}
}



package hello;
import java.util.Random; 
import java.util.Scanner;

class Dice {
// (문제2-2) Dice 클래스를 구현하는 위치
  private int face;
  public Dice() {
    face = 0;
  }
  public int roll() {
    Random random = new Random();
    face = random.nextInt(6) + 1;
    return face;
  }

  public int getValue() {
    return face;
  }
  public void setValue(int value) {
    if (value >= 1 && value <= 6) {
      face = value;
    } else {
      System.out.println("Error: Invalid value.");
      System.exit(0);
    }
  }
}

class Dog1{
// (문제2-3) Dog 클래스를 구현하는 위치
  private String name;
  private String breed;
  private int age;

  public Dog1(String name, String breed, int age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
  }

  public void Dog(String name, String breed, int age) {
// TODO Auto-generated constructor stub
}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   public String getBreed() {
     return breed;
   }

   public void setBreed(String breed) {
     this.breed = breed;
   }

   public int getAge() {
     return age;
   }

   public void setAge(int age) {
     this.age = age;
   }


   public String toString() {
     return "(애칭) " + name + ", (견종) " + breed + ", (나이) " + age + "살";
   }

   //"멍멍"
   public void barking() {
     System.out.println("멍멍!");
   }
}

public class Practice22 {

static void generate3X5() {

// (문제2-1) generate3X5() 메소드를 구현하는 위치
 int[][] arr = new int[3][5];
 for (int i = 0; i < arr.length; i++) {
   for (int j = 0; j < arr[i].length; j++) {
     arr[i][j] = 0;
   }
 }

 int[] nums = {1, 2, 3, 4, 5};
 Random rand = new Random();
 for (int i = nums.length - 1; i > 0; i--) {
   int j = rand.nextInt(i + 1);
   int temp = nums[i];
   nums[i] = nums[j];
   nums[j] = temp;
 }

 int k = 0;
 while (k < nums.length) {
   int row = rand.nextInt(arr.length);
   int col = rand.nextInt(arr[row].length);
   if (arr[row][col] == 0) {
     arr[row][col] = nums[k];
     k++;
   }
 }

 for (int i = 0; i < arr.length; i++) {
   for (int j = 0; j < arr[i].length; j++) {
     System.out.print(arr[i][j] + " ");
   }
   System.out.println();
 }
}


public static void main(String[] args) {

generate3X5();  // (문제2-1) 3X5 크기 2차원배열 생성과 출력   <--- (테스트 코드)


// (문제2-2) 4장 Mini Project - 주사위 클래스   <--- (테스트 코드)
Dice dice1, dice2;
int rollCount;

dice1 = new Dice();
dice2 = new Dice();
rollCount = 0;

System.out.println("\n--- (문제2-2) 4장 Mini Project - 주사위 클래스 ---");
do {
dice1.roll();
dice2.roll();
System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue());
rollCount++;
} while ((dice1.getValue() + dice2.getValue()) != 2);

System.out.println("(1, 1)이 나오는데 걸린 횟수= " + rollCount);
// (문제2-2) 끝


// (문제2-3) Dog 클래스 만들기   <--- (테스트 코드)
System.out.println("\n--- (문제2-3) Dog 클래스 만들기 ---");
String name, breed;
int age;
   Scanner source = new Scanner(System.in);

            System.out.println("강아지 이름:, 종류:, 나이: ");
            name = source.next();
            breed = source.next();
            age = source.nextInt();
   Dog1 dog = new Dog1(name, breed, age);
   source.close();
    System.out.println(dog);
    dog.barking();
// (문제2-3) 끝

}
}




3.

package hello;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private int score;

    public Book(String title, int score) {
        this.title = title;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", score=" + score + "]";
    }
}

class Phone {
    protected String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void talk() {
        System.out.println(owner + "가 통화 중이다.");
    }
}

class AnsweringPhone extends Phone {
    protected String when;

    public AnsweringPhone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    public void autoAnswering() {
        System.out.println(owner + "가 부재 중이다. " + when + " 전화 줄래.");
    }
}

class SmartPhone extends AnsweringPhone {
    private String game;

    public SmartPhone(String owner, String when, String game) {
        super(owner, when);
        this.game = game;
    }

    public void playGame() {
        System.out.println(owner + "가 " + game + " 게임을 하는 중이다. " + when + " 전화 줄래.");
    }
}

class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void show() {
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + speed);
    }
}

class Car extends Vehicle {
    int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    @Override
    public void show() {
        System.out.println("자동차 색상 : " + color);
        System.out.println("자동차 속도 : " + speed);
        System.out.println("자동차 배기량 : " + displacement);
        System.out.println("자동차 기어 단수 : " + gears);
    }
}

public class Practice33 {
    public static void main(String[] args) {
        // (문제3-1) 테스트 코드
    	System.out.println("---(문제3-1)---");
        ArrayList<Book> books = new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    System.out.println("============================");
			    System.out.println("1. 책 등록");
			    System.out.println("2. 책 검색");
			    System.out.println("3. 모든 책 출력");
			    System.out.println("4. 종료");
			    System.out.println("============================");
			    System.out.print("메뉴를 선택하시오: ");
			    int choice = scanner.nextInt();
			    scanner.nextLine(); // 개행 문자 제거

			    switch (choice) {
			        case 1:
			            System.out.print("책 제목: ");
			            String title = scanner.nextLine();
			            System.out.print("책 평점: ");
			            int score = scanner.nextInt();
			            scanner.nextLine(); // 개행 문자 제거
			            Book newBook = new Book(title, score);
			            books.add(newBook);
			            System.out.println("============================");
			            break;
			        case 2:
			            System.out.print("책 제목: ");
			            String searchTitle = scanner.nextLine();
			            int count = 0;
			            for (Book book : books) {
			                if (book.getTitle().contains(searchTitle)) {
			                    System.out.println(book);
			                    count++;
			                }
			            }
			            System.out.println("검색된 책 갯수: " + count + "권");
			            System.out.println("============================");
			            break;
			        case 3:
			            System.out.println("등록된 책 갯수: " + books.size() + "권");
			            for (Book book : books) {
			                System.out.println(book);
			            }
			            System.out.println("============================");
			            break;
			        case 4:
			            System.out.println("테스트가 종료하고 (문제3-2) 테스트가 시작됨");
			            testPhoneClasses();
			            testVehicleClasses();
			            return; // Exit the program
			        default:
			            System.out.println("잘못된 메뉴 선택입니다.");
			            break;
			    }
			}
		}
    }

    private static void testPhoneClasses() {
        Phone[] phones = {
            new Phone("황진이"),
            new AnsweringPhone("길동이", "내일"),
            new SmartPhone("민국이", "저녁때", "갤러그")
        };
        System.out.println("              ");
        System.out.println("              ");
        System.out.println("---(문제3-2)---");
        for (Phone phone : phones) {
            if (phone instanceof SmartPhone) {
                ((SmartPhone) phone).playGame();
            } else if (phone instanceof AnsweringPhone) {
                ((AnsweringPhone) phone).autoAnswering();
            } else {
                phone.talk();
            }
        }
    }

    private static void testVehicleClasses() {
    	System.out.println("              ");
        System.out.println("              ");
        System.out.println("---(문제3-3)---");


        Vehicle v = new Vehicle("실버", 150);
        v.show();

        System.out.println();

        Car c = new Car("파랑", 200, 1000, 5);
        c.show();

        System.out.println();

        Vehicle v2 = c;
        v2.show();
    }
}





4.
package hello;


//(큐실습4-1)
interface Queue {
	void enqueue(int item);
	int dequeue();
	boolean isEmpty();
	void display();
}

class MyQueue implements Queue {
	private static int front, back, capacity;
	private static int queue[];
	private final int INC_SIZE = 3;

	public MyQueue(int size) {
		front = back = 0;
		capacity = size;
		queue = new int[capacity];
	}

	public void enqueue(int item) {
		
		if (back == capacity) {
			int newCapacity = capacity + INC_SIZE;
			int newQueue[] = new int[newCapacity];
			System.out.print("Queue is full... Increasing capacity from " + capacity + " to " + newCapacity + "\n");
			for (int i = 0; i < capacity; i++) {
				newQueue[i] = queue[i];
			}
			capacity = newCapacity;
			queue = newQueue;
		}
		queue[back++] =	item;
}

	public int dequeue() {
		
		if (isEmpty()) {
			System.out.print("Queue is Empty");
			return -1;
		}
		int item = queue[front];
		for (int i = 0; i < back - 1; i++) {
			queue[i] = queue[i + 1];
		}
		back--;
		return item;
	}

	public void display() {
		
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.print("[ ");
		for (int i = front; i < back; i++) {
			System.out.print (queue[i] + " ");
		    }
		    System.out.print("]" + "\n");
	}

	@Override
	public boolean isEmpty() {
		
		return front == back;
		
	}
}


//(큐실습4-2)
class CardDeckk implements java.util.Iterator {
private static String[] cardNames = {
      "2", "3", "4", "5", "6", "7", "8", "9",
	     "10", "Jack", "Queen", "King", "Ace" };
private int current = 0;
private String lastRetrieved = null;


public boolean hasNext() {
		
	return current < cardNames.length;
		
}
public Object next() {
		
		if (!hasNext()) {
			return null;
		}
		lastRetrieved = cardNames[current];
		return cardNames[current++];
		
}
public void remove() {  
	if (lastRetrieved != null) {
		int indexToRemove = --current;
	    String[] newCardNames = new String[cardNames.length - 1];
	    int newIndex = 0;

	    for (int i = 0; i < cardNames.length; i++) {
	        if (i != indexToRemove) {
	            newCardNames[newIndex] = cardNames[i];
	            newIndex++;
	        }
	    }

	    cardNames = newCardNames;
	}
	
  }
}


//(클래스4-3)
interface GetInfo {
	double getValue();
	static double average(GetInfo[] objects) {
      if (objects.length == 0) {
         return 0; 
      }
      double gpa = 0.0;
      for (GetInfo obj : objects) {
          gpa += obj.getValue();
      }
      return gpa / objects.length;
  }
}      

class Student implements GetInfo {
	double score;

	public Student(double score) {
		this.score = score;
		
	}

	@Override
	public double getValue() {
		
		return score;
		
	}

	public static double average(GetInfo[] objects) {
		
		return GetInfo.average(objects);
		
	}
}


public class Practice4 {
	public static void main(String[] args) {
	// (큐실습4-1)
		System.out.println("---(큐실습4-1)---");
		MyQueue q = new MyQueue(3);
		q.display();
		q.enqueue(10);
		q.display();
		q.enqueue(20);
		q.display();
		q.enqueue(30);
		q.display();
		q.enqueue(40);
		q.display();
		q.enqueue(50);
		q.display();
		q.enqueue(60);
		q.display();
		q.enqueue(70);
		q.display();

		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();

	// (큐실습4-2)
		System.out.println("\n---(문제4-2)---");
      System.out.println("(첫번째 리딩)");
      CardDeckk c = new CardDeckk();
      while (c.hasNext()) {
      	String s = (String) c.next();
      	if(s.equals("Jack")) c.remove();
           System.out.println("next()가 반환하는 값:"+ s);
      }
      System.out.println("(두번째 리딩)");
      c = new CardDeckk();
      while (c.hasNext()) {
          System.out.println("next()가 반환하는 값:"+ c.next());
   }

	// (클래스4-3)
		System.out.println("\n---(클래스4-3)---");
		Student[] list = new Student[3];
		list[0] = new Student(10.0);
		list[1] = new Student(20.0);
		list[2] = new Student(30.0);
		System.out.println(Student.average(list));
	}
}



2018.
class Solution {
    public int solution(int[] scores, int goal) {
        int answer = 0;
        answer = goal * 7;
        for (int score : scores) {
            answer -= score;
        }
        if (answer > 0) {
            return answer;
        } else {
            return 0;
        }
    }
}






class Solution {
    public int solution(int[] input) {
        int count = 0;
        for (int water : input) {
            if (water == 0) count += 1;
            else count = 0;
            if (count >= 3) return 0;
        }
        return 1;
    }
}





class Solution {
    public int solution(String[] param0, String param1) {
        int winner_count = 0;
        int count = 0;
        for (String country : param0) {
            count += 1;
            if (country.equals(param1)) winner_count += 1;
        }
        return count / winner_count;
    }
}






//아래 코드는 지우지 마세요.
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}

//아래 코드를 조건에 맞게 구현 하세요.
class Customer {
    public String name;
    public int age;
    public static int numOfCustomers = 0;
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static int getNumOfCustomers() {
        return numOfCustomers;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Customer() {
        this.name = "unknown";
        this.age = 1;
        this.numOfCustomers += 1;
    }
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.numOfCustomers += 1;
    }
}









//아래 코드를 조건에 맞게 구현 하세요, 필요시 수정해야 합니다.

class Computer{
    protected String memory;
    protected String disk;
    protected boolean powered;
    public String getMemory() {
        return this.memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public String getDisk() {
        return this.disk;
    }
    public void setDisk(String disk) {
        this.disk = disk;
    }
    public boolean getPowered() {
        return this.powered;
    }
    public void setPowered(boolean powered) {
        this.powered = powered;
    }
    public void powerOn() {
        this.powered = true;
    }
    public Computer() {
        this.memory = "4GB";
        this.disk = "300GB";
        this.powered = false;
    }
    public Computer(String memory, String disk, boolean powered) {
        this.memory = memory;
        this.disk = disk;
        this.powered = powered;
    }
}

class Notebook extends Computer{
    private int battery;
    public int getBattery() {
        return this.battery;
    }
    public void setBattery(double battery) {
        this.battery = (int)battery;
    }
    public void powerOn() {
        if (this.battery > 0) this.powered = true;
        else this.powered = false;
    }
    public Notebook() {
        super();
        this.battery = 100;
    }
    public Notebook(String memory, String disk, boolean powered, double battery) {
        super(memory, disk, powered);
        this.battery = (int)battery;
    }
}

class Desktop extends Computer{
    private boolean plugged;
    public boolean getPlugged() {
        return this.plugged;
    }
    public void setPlugged(boolean plugged) {
        this.plugged = plugged;
    }
    public void powerOn() {
        if (plugged) this.powered = true;
        else this.powered = false;
    }
    public Desktop() {
        super();
        this.plugged = false;
    }
    public Desktop(String memory, String disk, boolean powered, boolean plugged) {
        super(memory, disk, powered);
        this.plugged = plugged;
    }
}

//아래 코드는 지우지 마세요
class Solution {
    public int solution(int ignore) {
        int answer = 0;
        return answer;
    }
}
