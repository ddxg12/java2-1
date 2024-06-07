# 최한솔 학번 : 202130235

## 6월 7일 강의  
### chapter 11
#### 스윙 컴포넌트 그리기,paintComponent()  
##### 스윙의 페인팅 기본  
 - 모든 컴포넌트는 자신의 모양을 스스로 그린다.  
 - 컨테이너는 자신을 그린 후 그 위에 자식 컴포넌트들에게 그리기 지시  
 - 모든 스윙 컴포넌트는 자신의 모양을 그리는 paintComponent() 메소드 보유  
##### public void paintComponent(Graphics g)  
 - 스윙 컴포넌트가 자신의 모양을 그리는 메소드  
 - JComponent의 메소드 : 모든 스윙 컴포넌트가 이 메소드를 오버라이딩함  
 - 언제 호출되는가?  
   1. 컴포넌트가 그려져야 하는 시점마다 호출  
   2. 크기가 변경되거나, 위치가 변경되거나, 컴포넌트가 가려졌던 것이 사라지는 등(개발자가 직접 호출하면 안됨)  
 - 매개변수인 Graphics 객체  
   1. 그래픽 컨텍스트 : 컴포넌트 그리기에 필요한 도구를 제공하는 객체  
   2. 자바 플랫폼에 의해 공급  
   3. 색 지정,도형 그리기,클리핑,이미지 그리기 등의 메소드 제공  
#### paintComponent()의 오버라이딩과 JPanel  
##### paintComponent(Graphic g)의 오버라이딩  
 - 개발자가 JComponent를 상속받아 새로운 컴포넌트 설계  
 - 기존 컴포넌트의 모양에 변화를 주고자 할때  
##### JPanel  
 - 비어 있는 컨테이너  
 - 개발자가 다양한 GUI를 창출할 수 있는 캔버스로 적합  
 - JPanel을 상속받아 개발자 임의의 모양을 가지는 패널로 많이 사용  
#### 그래픽 기반 GUI 프로그래밍  
##### 그래픽 기반 GUI 프로그래밍  
 - 스윙 컴포넌트에 의존하지 않고 선, 원 이미지 등을 이용하여 직접 화면을 구성하는 방법  
 - 그래픽 기반 GUI 포르그래밍의 학습이 필요한 이유  
   1. 컴포넌트의 한계를 극복하고 차트, 게임 등 자유로운 콘텐트 표현  
   2. 그래픽은 컴포넌트에 비해 화면 출력 속도가 빠름  
   3. 스윙 컴포넌트들로 모두 그래픽으로 작성되어 있어, 그래픽에 대한 학습은 자바 GUI의 바탕 기술을 이해하는데 도움  
   4. 그래픽을 이용하여 개발자 자신만의 컴포넌트 개발  
#### Graphics와 문자열 출력  
##### Graphics의 기능  
 - 색상 선택하기  
 - 문자열 그리기  
 - 도형 그리기  
 - 도형 칠하기  
 - 이미지 그리기  
 - 클리핑  
##### 문자열 출력을 위한 Graphics 메소드  
 - void drawString(String str, int x, int y) - str 문자열을(x,y)영역에 그림.현재 Graphics에 설정된 색과 폰트로 문자열 출력  
#### 그래픽의 색과 폰트  
##### 색 : Color 클래스  
 - 자바의 색 : r(Red), g(Green), b(Blue) 성분으로 구성, 각 성분은 0~255(8비트) 범위의 정수  
   - color(int r, int g, int b) r,g,b 값으로 sRGB 색 생성  
##### 폰트 : Font 클래스  
 - Font(String fontFace, int style, int size)  
##### Graphics에 색과 폰트 설정  
 - void setColor(Color color)  
 - void setFont(Font font)  
#### 도형 그리기와 칠하기  
##### 도형 그리기  
 - 선, 타원, 사각형, 둥근 모서리 사각형, 원호, 폐 다각형 그리기  
 - 선의 굵기 조절할 수 없음  
 - void drawLine(int x1, int y1, int x2, int y2) - (x1,y1)에서 (x2,y2)까지 선을 그린다.  
 - void drawOval(int x, int y, int w, int h) - (x,y)에서 w * h 크기의 사각형에 내접하는 타원을 그린다.  
 - void drawRect(int x, int y, int w, int h) - (x,y)에서 w * h 크기의 사각형을 그린다.  
 - void drawRoundRect(int x, int y, int w, int h, int arcWidth, int arcHeight)  
   (x,y)에서 w * h 크기의 사각형을 그리되, 4개의 모서리는 arcWidth, arcHeight를 이용하여 원호를 그린다.
 ##### 도형 칠하기  
 - 도형을 그리고 내부를 칠하는 기능  
   - 도형의 외곽선과 내부를 따로 칠하는 기능 없음  
 - 도형 칠하기를 위한 메소드  
   - 그리기 메소드 명에서 draw 대신 fill로 이름 대치하면 됨. fillRect(), fillOval() 등  
#### Graphics의 원호와 폐다각형 그리기 메소드  
 - void drawArc(int x, int y, int w, int h, int startAngle, int arcAngle)  
   (x,y)에서 w * h 크기의 사각형에 내접하는 원호를 그린다. 3시 방향이 0도의 기점이다. startAngle 지점에서 arcAngle 각도만큼 원호를 그린다. arcAngle이 양수이면 반시계 방향, 음수이면 시계 방향으로 그린다.  
#### 스윙에서 이미지를 그리는 2 가지 방법  
##### JLabel을 이용한 이미지 그리기  
 - ImageIcon image = new ImageIcon("images/apple.jpg");
   JLabel label = new JLabel(image);  
   panel.add(label);  
 - 장점 : 이미 그리기 간편 용이  
 - 단점 : 이미지의 원본 크기대로 그리므로 이미지 크기 조절 불가  
##### Graphics의 drawImage()로 이미지 출력  
 - 장점 : 이미지 일부분 등 이미지의 원본 크기와 다르게 그리기 가능  
 - 단점 : 컴포넌트로 관리할 수 없음, 이미지의 위치나 크기 등을 적절히 조절하는 코딩 필요  
#### repaint()  
##### repaint()  
 - 모든 컴포넌트가 가지고 있는 메소드  
 - 자바 플랫폼에게 컴포넌트 그리기를 강제 지시하는 메소드  
 - repaint()를 호출하면, 자바 플랫폼이 컴포넌트의 paintComponent() 호출  
##### repaint()의 호출이 필요한 경우  
 - 개발자가 컴포넌트를 다시 그리고자 하는 경우  
   - 프로그램에서 컴포넌트의 모양과 위치를 변경하고 바로 화면에 반영시키고자 하는 경우  
   - 컴포넌트가 다시 그려져야 그 때 변경된 위치에 변경된 모양으로 출력됨  
   - repaint()는 자바 플랫폼에게 지금 당장 컴포넌트를 다시 그리도록 지시함  
##### 부모 컴포넌트부터 다시 그리는 것이 좋음  
 - 컴포넌트 repaint()가 불려지면  
   - 이 컴포넌트는 새로운 위치에 다시 그려지지만 이전의 위치에 있던 자신의 모양이 남아 있음  
 - 부모 컴포넌트의 repaint()를 호출하면  
   - 부모 컨테이너의 모든 내용을 지우고 자식을 다시 그리기 때문에 컴포넌트의 이전 모양이 지워지고 새로 변경된 크기나 위치에 그려짐  
### chapter 12  
#### 멀티태스킹(multi-tasking) 개념  
##### 멀티태스킹   
 - 여러 개의 작업(태스크)이 동시에 처리되는 것  
 - 멀티태스킹 프로그램 사례: 미디어 플레이어의 멀티태스킹 , 테트리스 게임의 멀티태스킹  
#### 스레드와 운영체제  
##### 스레드(thread)  
 - 운영체제에 의해 관리되는 하나의 작업 혹은 태스크  
 - 스레드와 태스크(혹은 작업)은 바꾸어 사용해도 무관  
##### 멀티스레딩(multi-threading)  
 - 여러 스레드를 동시에 실행시키는 응용프로그램을 작성하는 기법  
##### 스레드 구성  
 - 스레드 코드  
   - 작업을 실행하기 위해 작성한 프로그램 코드  
   - 개발자가 작성  
 - 스레드 정보  
   - 스레드 명, 스레드 ID, 스레드의 실행 소요 시간, 스레드의 우선 순위 등  
   - 운영체제가 스레드에 대해 관리하는 정보  
#### 멀티태스킹과 멀티스레딩  
##### 멀티태스킹 구현 기술  
 - 멀티프로세싱(multi-processing)  
   - 하나의 응용프로그램이 여러 개의 프로세스를 생성하고, 각 프로세스가 하나의 작업을 처리하는 기법  
   - 각 프로세스 독립된 메모리 영역을 보유하고 실행  
   - 프로세스 사이의 문맥 교환에 따른 과도한 오버헤드와 시간 소모의 문제점  
 - 멀티스레딩(multi-threading)  
   - 하나의 응용프로그램이 여러 개의 스레드를 생성하고, 각 스레드가 하나의 작업을 처리하는 기법  
   - 하나의 응용프로그램에 속한 스레드는 변수 메모리, 파일 오픈 테이블 등 자원으로 공유하므로, 문맥 교환에 따른 오버헤드가 매우 작음  
   - 현재 대부분의 운영체제가 멀티스레딩을 기본으로 하고있음  
#### 자바 스레드(Thread)와 JVM  
##### 자바 스레드  
 - 자바 가상 기계(JVM)에 의해 스케쥴되는 실행 단위의 코드 블럭  
 - 스레드의 생명 주기는 JVM에 의해 관리됨 : JVM은  스레드 단위로 스케쥴링  
##### JVM과 자바의 멀티스레딩  
 - 하나의 JVM은 하나의 자바 응용프로그램만 실행  
   - 자바 응용프로그램이 시작될 때 JVM이 함께 실행됨  
   - 자바 응용프로그램이 종료하면 JVM도 함께 종료됨  
 - 응용 프로그램은 하나 이상의 스레드로 구성 가능  
#### 자바 스레드 만들기  
##### 스레드 만드는 2가지 방법  
 - java.lang.Thread 클래스를 상속받아 스레드 작성  
 - java.lang.Runnable 인터페이스를 구현하여 스레드 작성  
#### Thread 클래스를 상속받아 스레드 만들기  
##### Thread를 상속받아 run() 오버라이딩  
 - thread 클래스 상속. 새 클래스 작성  
 - run() 메소드 작성  
   - run() 메소드를 스레드 코드라고 부름  
   - run() 메소드에서 스레드 실행 시작  
##### 스레드 객체 생성  
 - 생성된 객체는 필드와 메소드를 가진 객체일 뿐 스레드로 작동하지 않음  
##### 스레드 시작  
 - start() 메소드 호출  
   - 스레드로 작동 시작  
   - 스레드 객체의 run()이 비로소 실행  
   - JVM에 의해 스케쥴되기 시작함  
#### Runnable 인터페이스로 스레드 만들기  
##### Runnable 인터페이스 구현하는 새 클래스 작성  
 - run() 메소드 구현  
   - run() 메소드를 스레드 코드라고 부름  
   - run() 메소드에서 스레드 실행 시작  
##### 스레드 객체 생성  
 - Thread th = new Thread(new TimerRunnable());  
##### 스레드 시작  
 - start() 메소드 호출  
   - 스레드로 작동 시작  
   - 스레드 객체의 run()이 비로소 실행  
   - JVM에 의해 스케쥴되기 시작함  
#### main 스레드  
##### main 스레드  
 - main() 메소드 실행 시작  
 - main() 메소드가 종료하면 main 스레드 종료  
#### 스레드 종료와 타 스레드 강제 종료  
##### 스스로 종료  
 - run() 메소드 리턴  
##### 타 스레드에서 강제 종료  
 - interrupt() 메소드 사용  
#### 스레드 동기화(Thread Synchronization)  
##### 멀티스레드 프로그램 작성시 주의점  
 - 다수의 스레드가 공유 데이터에 동시에 접근하는 경우  
   - 공유 데이터의 값에 예상치 못한 결과 발생 가능  
##### 스레드 동기화  
 - 동기화란?  
   - 스레드 사이의 실행순서 제어, 공유데이터에 대한 접근을 원활하게 하는 기법  
 - 멀티스레드의 공유 데이터의 동시 접근 문제 해결  
   - 방법1 : 공유 데이터를 접근하는 모든 스레드의 한 줄 세우기  
   - 방법2 : 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드가 대기 하도록 함  
##### 자바의 스레드 동기화 방법 - 2가지  
 - synchronized 키워드로 동기화 블록 지정  
 - wait()-notify() 메소드로 스레드의 실행 순서 제어  
#### synchronized 블록 지정  
##### synchronized 키워드  
 - 스레드가 독점적으로 실행해야 하는 부분(동기화 코드)을 표시하는 키워드  
   - 임계 영역(critical section) 표기 키워드  
 - synchronized 블록 지정 방법  
   - 메소드 전체 혹은 코드 블록  
##### synchronized 블록이 실행될 때  
 - 먼저 실행한 스레드가 모니터 소유  
   - 모니터란 해당 객체를 독점적으로 사용할 수 있는 권한  
 - 모니터를 소유한 스레드가 모니터를 내놓을 때까지 다른 스레드 대기  
#### wait()-notify()를 이용한 스레드 동기화  
##### wait()-notify()가 필요한 경우  
 - 공유 데이터로 두 개 이상의 스레드가 데이터를 주고 받을 때  
   - producer-consumer 문제  
 - 동기화 메소드  
   - wait() : 다른 스레드가 notify()를 불러줄 때까지 기다린다.  
   - notify() : wait()를 호출하여 대기중인 스레드를 깨운다.  
     - wait(), notify()는 Object의 메소드
## 5월 31일 강의  
#### 자바의 GUI 프로그래밍 방법  
##### 자바의 GUI 프로그래밍 방법 2 종류  
 - 컴포넌트 기반 GUI 프로그래밍  
   1. 스윙 컴포넌트를 이용하여 쉽게 GUI를 구축  
   2. 자바에서 제공하는 컴포넌트의 한계를 벗어나지 못함  
 - 그래픽 기반 GUI 프로그래밍  
   1. 그래픽을 이용하여 GUI 구축  
   2. 개발자가 직접 그래픽으로 화면을 구성하는 부담  
   3. 독특한 GUI를 구성할 수 있는 장점  
   4. GUI 처리의 실행 속도가 빨라, 게임 등에 주로 이용    
   * 스윙 컴포넌트는 이름이 모두 J자로 시작한다.  
#### 스윙 컴포넌트의 공통 메소드, JComponent의 메소드  
##### jComponent  
   1. 스윙 컴포넌트는 모두 상속받는 슈퍼 클래스, 추상 클래스  
   2. 스윙 컴포넌트들이 상속받는 공통 메소드와 상수 구현  
#### JLabel로 문자열과 이미지 출력  
##### JLabel의 용도   
 - 문자열이나 이미지를 화면에 출력하기 위한 목적 
##### 레이블 생성  
 - JLabeL() 빈 레이블  
 - JLabeL(Icon image) 이미지 레이블  
 - JLabeL(String text) 문자열 레이블  
 - JLabeL(String text, Icon image, int hAlign) 문자열과 이미지 모두 가진 레이블  
 - hAlign : 수평 정렬 값으로 SwingConstants.LEFT, SwingConstants.RIGHT, SwingConstants.CENTER 중 하나  
#### 레이블 생성 예  
##### 문자열 레이블 생성  
 - ex : JLabel textLabel = new JLabel("사랑합니다");  
##### 이미지 레이블 생성  
 - 이미지 파일로부터 이미지를 읽기 위해 Imagelcon 클래스 사용  
 - 다룰 수 있는 이미지 : png, gif, jpg  
   - sunset.jpg의 경로명이 "images/sunset.jpg"인 경우  
      Imageicon image = new ImageIcon("Images/sunset.jpg")  
      JLabel imageLabel = new JLabel(image);    
#### JButton으로 만들기  
##### JButton의 용도  
 - 버튼 모양의 컴포넌트. 사용자로부터 명령을 입력 받기 위한 목적  
 - 버튼은 클릭될 때 Action 이벤트 발생  
##### 버튼 생성  
 - JButton() 빈 버튼  
 - JButton(Icon image) 이미지 버튼  
 - JButton(String text) 문자열 버튼  
 - JButton(String text, Icon image) 문자열과 이미지 모두 가진 버튼  
   - "hello" 문자열을 가진 버튼 생성 예시 : JButton btn = new JButton("hello");  
#### 이미지 버튼 만들기  
##### 하나의 버튼에 3 개의 이미지 등록  
 - 마우스 조작에 따라 3개의 이미지 중 적절한 이미지 자동 출력  
##### 3개의 버튼 이미지  
 - normalicon  
   1. 버튼의 보통 상태(디폴트)때 출력되는 이미지  
   2. 생성자에 이미지 아이콘 전달 혹은 JButton의 setIcon(normallcon);  
 - rollovericon  
   1. 버튼에 마우스가 올라갈 때 출력되는 이미지  
   2. 이미지 설정 메소드 : JButton의 setRolloverIcon(rollovericon);  
 - pressedicon  
   1. 버튼을 누른 상태 때 출력되는 이미지  
   2. 이미지 설정 메소드 : JButton의 setPressedIcon(pressedicon);  
#### 이미지 버튼에 이미지 설정  
##### 이미지 로딩  
 - 필요한 이미지 로딩 : new ImageIcon(이미지 경로명);  
 - 사례 : ImageIcon normalicon = new ImageIcon("images/normalicon.gif");  
##### 버튼에 이미지 등록  
 - JButton의 메소드를 호출하여 이미지 등록  
 - 사례 : JButton button = new JButton("테스트 버튼", normalicon); // normalicon 달기  
 - 실행 중에 normal 이미지(디폴트 이미지) 교체 사례  : imageicon newicon = new imageicon("images/   newicon.gif")  
            button.setIcon(newicon); //디폴트 이미지 변경  
#### JCheckBox로 체크박스 만들기  
##### JCheckBox의 용도  
 - 선택(selected)과 비선택(deselected) 두 상태만 가지는 버튼  
##### 체크박스 생성  
 - JCheckBox() 빈 체크박스  
 - JCheckBox(Icon image) 이미지 체크박스  
 - JCheckBox(Icon image, boolean selected) 이미지 체크박스  
 - JCheckBox(String text, Icon image) 문자열과 이미지를 가진 체크박스  
 - JCheckBox(String text, Icon image, boolean selected) 문자열과 이미지 체크박스  
 * selected : true면 선택 상태로 초기화  
    - 문자열을 가진 체크박스 생성 예시 : JCheckBox apple =new JCheckBox("사과");//"사과"체크박스생성  
#### 체크박스에 Item 이벤트 처리  
##### Item 이벤트  
 - 체크 박스의 선택 상태에 변화가 생길 때 발생하는 이벤트  
   - 사용자가 마우스나 키보드로 체크박스를 선택/해제할 때  
   - 프로그램에서 체크박스를 선택/해제하여 체크 상태에 변화가 생길 때    
      JCheckBox c = new JCheckBox("사과");  
      c.setSelected(true); // 선택 상태로 변경  
 - 이벤트가 발생하면 ItemEvent 객체 생성  
 - ItemListener 리스너를 이용하여 이벤트 처리  
##### ItemListener 리스너의 추상 메소드  
 - void ItemStateChanged(ItemEvent e) 체크박스의 선택 상태가 변하는 경우 호출  
##### ItemEvent의 주요 메소드  
 - int getStateChange() 체크박스가 선택된 경우 ItemEvent.SELECTED를, 해체된 경우 ItemEvent.DESELECTED를 리턴한다.  
 - Object getItem() 이벤트를 발생시킨 아이템 객체를 리턴한다. 체크박스의 경우 JCheckBox 컴포넌트의 래퍼런스를 리턴한다.  
#### JRadioButton으로 라디오버튼 만들기  
##### JRadioButton의 용도  
 - 버튼 그룹을 형성하고, 그룹에 속한 버튼 중 하나만 선택되는 라디오버튼  
 - 체크박스와의 차이점  
   - 체크 박스는 각각 선택/해제가 가능하지만, 라디오버튼은 그룹에 속한 버튼 중 하나만 선택  
 - 라디오버튼 생성  
   - JRadioButton() 빈 라디오버튼  
   - JRadioButton(Icon image) 이미지 라디오버튼  
   - JRadioButton(Icon image, boolean selected) 이미지 라디오버튼  
   - JRadioButton(String text) 문자열 라디오버튼  
   - JRadioButton(String text, boolean selected) 문자열 라디오버튼  
   - JRadioButton(String text, Icon image) 문자열과 이미지를 가진 라디오버튼  
   - JRadioButton(String text, Icon image, boolean selected) 문자열과 이미지를 가진 라디오버튼  
   - selected : true면 선택 상태로 초기화  
#### 라디오버튼 생성 및 Item 이벤트 처리  
##### 버튼 그룹과 라디오버튼 생성 과정  
  1. 버튼 그룹 객체 생성  
  2. 라디오 버튼 생성  
  3. 라디오버튼을 버튼 그룹에 삽입  
  4. 라디오버튼을 컨테이너에 삽입  
##### 라디오버튼에 Item 이벤트 처리 : ItemListener 리스너 이용  
  - 라디오버튼이 선택/해제되어 상태가 달라지면, Item 이벤트 발생  
    - 사용자가 마우스나 키보드로 선택 상태를 변경할 때  
    - 프로그램에서 JRadioButton의 setSelected()를 호출하여 선택 상태를 변경할 때  
#### JTextField로 한 줄 입력 창 만들기  
##### JTextField  
 - 한 줄의 문자열을 입력 받는 창(텍스트필드)  
   - 텍스트 입력 도중 Enter 키가 입력되면 Action 이벤트 발생  
   - 입력 가능한 문자 개수와 입력 창의 크기는 서로 다름  
##### 텍스트필드 생성  
 - JTextField() 빈 텍스트필드  
 - JTextField(int cols) 입력 창의 열의 개수가 cols개인 텍스트필드  
 - JTextField(String text) text 문자열로 초기화된 텍스트필드  
 - JTextField(String text, int cols) 입력 창의 열의 개수는 cols개이고 text 문자열로 초기화된 텍스트필드  
 - "컴퓨터공학과" 로 초깃값을 가지는 텍스트필드 생성 예시  
    - JTextField tf2 = new JTextField("컴퓨터공학과")  
#### TextArea로 여러 줄의 입력 창 만들기  
##### JTextArea  
 - 여러 줄의 문자열을 입력받을 수 있는 창(텍스트영역)  
   - 스크롤바를 지원하지 않는다.  
   - JScrollPane 객체에 삽입하여 스크롤바 지원받음  
##### 생성자  
 - JTextArea() 빈 텍스트 영역  
 - JTextArea(int rows, int cols) 입력 창이 rows x cols개의 문자 크기인 텍스트영역  
 - JTextArea(String text) text 문자열로 초기화된 텍스트영역  
 - JTextArea(String text, int rows, int cols) 입력 창이 rows x cols개의 문자 크기이며 text 문자열로 초기화된 텍스트영역  
#### JList.E  
##### JList.E  
 - 하나 이상의 아이템을 보여주고 아이템을 선택하도록 하는 리스트  
 - Java7부터 제네릭 리스트로 바뀜  
   - E에 지정된 타입의 객체만 저장하는 리스트  
 - JScrollPane에 JList.E 를 삽입하여 스크롤 가능  
##### 리스트 생성  
 - JList.E() 빈 리스트  
 - JList.E(Vector ListData) 벡터로부터 아이템을 공급받는 리스트  
 - JList.E(Object [] ListData) 배열로부터 아이템을 공급받는 리스트  
#### JComboBox.E  
##### JComboBox.E  
 - 텍스트필드와 버튼, 그리고 드롭다운 리스트로 구성되는 콤보박스  
 - 드롭다운 리스트에서 선택한 것이 텍스트필드에 나타남  
##### 콤보박스 생성 예시  
 - JComboBox.E() 빈 콤보박스  
 - JComboBox.E(Vector ListData) 벡터로부터 아이템을 공급받는 콤보박스  
 - JComboBox.E(Object [] ListData) 배열로부터 아이템을 공급받는 콤보박스  
#### 메뉴 구성  
##### 메뉴 만들기에 필요한 스윙 컴포넌트  
 - 메뉴 아이템 - JMenuItem  
 - 메뉴 - JMenu  
   - 여러 개의 메뉴 아이템을 가짐  
 - 메뉴바 - JMenuBar  
   - 여러 개의 메뉴를 붙이는 바이며, 프레임에 부착됨  
 - 분리선  
   - 메뉴아이템 사이의 분리선으로 separator라고 부름  
   - JMenu의 addSeparator()를 호출하여 삽입함    
#### 메뉴아이템에 Action 이벤트 달기  
#### 메뉴아이템을 클릭하면 Action 발생  
 - 메뉴아이템은 사용자로부터의 지시나 명령을 받는데 사용  
 - ActionListener 인터페이스로 리스너 작성  
 - 각 메뉴아이템마다 이벤트 리스너 설정  
#### 팝업 다이얼로그, JOptionPane  
##### 팝업 다이얼로그  
 - 사용자에게 메시지를 전달하거나 문자열을 간단히 입력받는 용도  
 - JOptionPane 클래스를 이용하여 생성  
   - static 타입의 간단한 메소드 이용  
##### 입력 다이얼로그 - JOptionPane.showInputDialog()  
 - 한 줄을 입력받는 다이얼로그  
   - static String JOptionPane.showInputDialog(String msg)  
   - msg : 다이얼로그 메시지  
   - 리턴 값 : 사용자가 입력한 문자열. 취소버튼이 선택되거나 창이 닫히면 Null로 리턴  
#### 확인 다이얼로그  
##### 확인 다이얼로그 - JOptionPane.showConfirmDialog()  
 - 사용자로부터 Yes/No 응답을 입력 받는 다이얼로그  
    - static int JOptionPane.showConfirmDialog(Component parentComponent, Object msg,String title, int optionType)  
    - parentComponent : 다이얼로그의 부모 컴포넌트로서 다이얼로그가 출력되는 영역의 범위 지정을 위해 사용(예: 프레임). null이면 전체 화면 중앙에 출력  
    - msg : 다이얼로그 메시지  
    - title : 다이얼로그 타이틀  
    - optionType : 다이얼로그 옵션 종류 지정  
      YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION  
    - 리턴 값 : 사용자가 선택한 옵션 종류  
      YES_OPTION, NO_OPTION, CANCEL_OPTION, OK_OPTION, CLOSED_OPTION  
#### 메시지 다이얼로그  
##### 메시지 다이얼로그 - showMessageDialog  
 - 단순 메시지를 출력하는 다이얼로그  
    - static void JOptionPane,showMessageDialog(Component parentComponent,Object msg, String title, int messageType)  
    - parentComponent : 다이얼로그의 부모 컴포넌트로서 다이얼로그가 출력되는 영역의 범위 지정을 위해 사용(예 : 프라임). null이면 전체 화면 중앙에 출력  
    - msg : 다이얼로그 메시지  
    - title : 다이얼로그 타이틀  
    - messageType : 다이얼로그의 종류로서 다음 중 하나  
      ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE 


## 5월 24일 강의  
#### 이벤트 기반 프로그래밍
##### 이벤트 기반 프로그래밍  
 - 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식  
   1. 이벤트가 발생하면 이벤트를 처리하는 루틴(이벤트 리스너) 실행  
   2. 실행될 코드는 이벤트의 발생에 의해 전적으로 결정  
 - 반대되는 개념 : 배치 실행(batch programming)  
   1. 프로그램의 개발자가 프로그램의 흐름을 결정하는 방식  
 - 이벤트 종류  
   1. 사용자의 입력 : 마우스 드래그,마우스 클릭,키보드 누름 등  
   2. 센서로부터의 입력, 네트워크로부터 데이터 송수신  
   3. 다른 응용프로그램이나 다른 스레드로부터의 메시지  
##### 이벤트 기반 응용 프로그램의 구조  
 - 각 이벤트마다 처리하는 리스너 코드 보유  
##### GUI 응용프로그램은 이벤트 기반 프로그래밍으로 작성됨  
 - GUI 라이브러리 종류  
   1. C++ 의 MFC, C# GUI, Visual Basic, X Window, Android 등  
   2. 자바의 AWT와 Swing  
#### 자바 스윙 프로그램에서 이벤트 처리 과정  
##### 이벤트가 처리되는 과정  
- 이벤트 발생  
 - 예 : 마우스의 움직임 혹은 키보드 입력  
- 이벤트 객체 생성  
 - 현재 발생한 이벤트에 대한 정보를 가진 객체  
- 응용프로그램에 작성된 이벤트 리스너 찾기  
- 이벤트 리스너 실행  
 - 리스너에 이벤트 객체 전달  
 - 리스너 코드 실행  
#### 이벤트 객체  
##### 이벤트 객체  
 - 발생한 이벤트에 관한 정보를 가진 객체  
 - 이벤트 리스너에 전달됨  
   - 이벤트 리스너 코드가 발생한 이벤트에 대한 상황을 파악할 수 있게 함  
##### 이벤트 객체가 포함되는 정보  
 - 이벤트 종류와 이벤트 소스  
 - 이벤트가 발생한 화면 좌표 및 컴포넌트 내 좌표  
 - 이벤트가 발생한 버튼이나 메뉴 아이템의 문자열  
 - 클릭된 마우스 버튼 번호 및 마우스의 클릭 횟수  
 - 키의 코드 값과 문자 값  
 - 체크박스, 라디오버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태  
 ##### 이벤트 소스를 알아 내는 메소드  
 - Object getSource()  
   - 발생한 이벤트의 소스 컴포넌트 리턴  
   - Object 타입으로 리턴하므로 캐스팅하여 사용  
   - 모든 이벤트 객체에 대해 적용  
#### 리스너 인터페이스  
##### 이벤트 리스너  
 - 이벤트를 처리하는 자바 프로그램 코드, 클래스로 작성  
##### 자바는 다양한 리스너 인터페이스 제공  
 - 예) ActionListener 인터페이스 - 버튼 클릭 이벤트를 처리하기 위한 인터페이스  
    - interface ActionListener { // 아래 메소드를 개발자가 구현해야 함  
        public void actionPerformed(ActionEvent e); //Action 이벤트 발생시 호출됨  
        }  
 - 예) MouseListener 인터페이스 - 마우스 조작에 따른 이벤트를 처리하기 위한 인터페이스  
    - interface MouseListener { // 아래의 5개 메소드를 개발자가 구현해야 함  
        public void mousePressed(MouseEvent e); // 마우스 버튼이 눌러지는 순간 호출  
        public void mouseReleased(MouseEvent e); // 눌러진 마우스 버튼이 떼어지는 순간 호출  
        public void mouseClicked(MouseEvent e); // 마우스가 클릭되는 순간 호출  
        public void mouseEntered(MouseEvent e);  //마우스가 컴포넌트 위에 올라가는 순간 호출
        public void mouseExited(MouseEvent e); //마우스가 컴포넌트 위에서 내려오는 순간 호출  
    }  
##### 사용자의 이벤트 리스너 작성  
 - 자바의 리스너 인터페이스(interface)를 상속받아 구현  
 - 리스너 인터페이스의 모든 추상 메소드 구현  
#### 이벤트 리스너 작성 과정 사례  
##### 1. 이벤트와 이벤트 리스너 선택  
 - 버튼 클릭을 처리하고자 하는 경우  
   - 이벤트 : Action 이벤트, 이벤트 리스너 : ActionListener  
##### 2. 이벤트 리스너 클래스 작성 : ActionListener 인터페이스 구현  
 - class MyActionListener implements ActionListener {  
      public void actionPerformed(ActionEvent e) {  //버튼이 클릭될 때 호출되는 메소드  
        JButton b = (JButton)e.getSource();         //사용자가 클릭한 버튼 알아내기
        if(b.getText().equals("Action))             //버튼의 문자열이 "Action"인지 비교
          b.setText("액션");                        //JButton의 setText() 호출. 문자열 변경
        else                                 
          b.setText("Action");                     //JButton의 setText() 호출.문자열 변경
     }
 }    
##### 3. 이벤트 리스너 등록  
 - 이벤트를 받아 처리하고자 하는 컴포넌트에 이벤트 리스너 등록  
 - component.addXXXListener(listener)  
   - xxx : 이벤트 명, listener : 이벤트 리스너 객체  
     - 예) MyActionListener listener = new MyActionListener(); // 리스너 인스턴스 생성  
           btn.addActionListener(listener);                    // 리스너 등록  
#### 이벤트 리스너 작성 방법  
##### 3 가지 방법  
 1. 독립 클래스로 작성  
   - 이벤트 리스너를 완전한 클래스로 작성  
   - 이벤트 리스너를 여러 곳에서 사용할 때 적합  
 2. 내부 클래스(inner class)로 작성  
   - 클래스 안에 멤버처럼 클래스 작성  
   - 이벤트 리스너를 특정 클래스에서만 사용할 때 적합  
 3. 익명 클래스(anonymous class)로 작성  
   - 클래스의 이름 없이 간단히 리스너 작성  
   - 클래스 조차 만들 필요 없이 리스너 코드가 간단한 경우에 적합  
#### 익명 클래스로 이벤트 리스너 작성  
##### 익명 클래스 : 이름 없는 클래스  
 - (클래스 선언 + 인스턴스 생성)을 한번에 달성  
   - 예 : new 익명클래스의슈퍼클래스이름(생성자인자들) {  
           .............  
           익명클래스의 멤버 구현  
           ............  
   };  
 - 간단한 리스너의 경우 익명 클래스 사용 추천  
   - 메소드의 개수가 1, 2개인 리스너에 대해 주로 사용  
#### 어댑터 클래스  
##### 이벤트 리스너 구현에 따른 부담  
 - 리스너의 추상 메소드를 모두 구현해야 하는 부담  
 - 예) 마우스 리스너에서 마우스가 눌러지는 경우(mousePressed())만 처리하고자 하는 경우에도 나머지 4 개의 메소드를 모두 구현해야 하는 부담  
##### 어댑터 클래스(Adapter)  
 - 리스너의 모든 메소드를 단순 리턴하도록 만든 클래스(JDK에서 제공)   
 - 추상 메소드가 하나뿐인 리스너는 어댑터 없음  
   - ActionAdapter, ItemAdapter 클래스는 존재하지 않음  
#### Key 이벤트와 포커스  
##### 키 입력 시, 다음 세 경우 각각 Key 이벤트 발생  
 - 키를 누르는 순간  
 - 누른 키를 떼는 순간  
 - 누른 키를 떼는 순간(Unicode 키의 경우에만)  
##### 키 이벤트를 받을 수 있는 조건  
 - 모든 컴포넌트  
 - 현재 포커스(focus)를 가진 컴포넌트가 키 이벤트 독점
##### 포커스(focus)  
 - 컴포넌트나 응용프로그램이 키 이벤트를 독점하는 권한  
 - 컴포넌트에 포커스 설정 방법  
  - component.requestFocus(); //component가 키 이벤트를 받을 수 있게 함  
#### KeyListener  
 - 응용 프로그램에서 KeyListener를 상속받아 키 리스너 구현  
 - KeyListener의 3 개 메소드  
   - 1.void keyPressed(KeyEvent e) {  
          // 이벤트 처리 루틴  
        }  
   - 2.void keyReleased(KeyEvent e) {
          // 이벤트 처리 루틴
        }  
   - 3.void keyTyped(KeyEvent e) {  
          // 이벤트 처리 루틴
        }  
 - 컴포넌트에 키 이벤트 리스너 달기  
    - component.addKeyListener(myKeyListener);  
#### 유니코드(Unicode) 키  
##### 유니코드 키의 특징  
  - 국제 산업 표준  
  - 전 세계의 문자를 컴퓨터에서 일관되게 표현하기 위한 코드 체계  
  - 문자들에 대해서만 키 코드 값 정의  
    - A~Z, a~z, 0~9, !, @, & 등  
  - 문자가 아닌 키 경우에는 표준화된 키 코드 값 없음  
    - Function 키, Home 키, Up 키, Delete 키, Control 키, Shift 키, Alt 등은 플랫폼에 따라 키 코드 값이 다를 수 있음  
##### 유니코드 키가 입력되는 경우  
  - KeyPressed(), KeyTyped(), KeyReleased() 가 순서대로 호출  
##### 유니코드 키가 아닌 경우  
  - keyPressed(), KeyReleased() 만 호출됨  
#### 가상 키와 입력된 키 판별  
##### KeyEvent 객체  
 - 입력된 키 정보를 가진 이벤트 객체  
 - KeyEvent 객체의 메소드로 입력된 키 판별  
##### keyEvent 객체의 메소드로 입력된 키 판별  
 - char KeyEvent.getKeyChar()  
   - 키의 유니코드 문자 값 리턴  
   - Unicode 문자 키인 경우에만 의미 있음  
   - 입력된 키를 판별하기 위해 문자 값과 비교하면 됨  
   - 예 : public void keyPressed(KeyEvent e) {  
            if(e.getKeyChar()=='q')  
            System.exit(0);  
          } q 키가 누르면 프로그램 종료  
 - int KeyEvent.getKeyCode()  
    - 유니코드 키 포함  
    - 모든 키에 대한 정수형 키 코드 리턴  
    - 입력된 키를 판별하기 위해 가상키(Virtual Key) 값과 비교하여야 함  
    - 가상 키 값은 KeyEvent 클래스에 상수로 선언  
    - 예 : public void KeyPressed(KeyEvent e) {  
              if(e.getKeyCode() -- KeyEvent.VK_F5)  
                System.exit(0);  
           } F5 ㅣㅋ를 누르면 프로그램 종료  
#### Mouse 이벤트와 MouseListener, MouseMotionListener  
##### Mouse 이벤트 : 사용자의 마우스 조작에 따라 발생하는 이벤트  
   - mouseClicked() : 마우스가 눌러진 위치에서 그대로 떼어질 때 호출  
   - mouseReleased() : 마우스가 눌러진 위치에서 그대로 떼어지든 아니든 항상 호출  
   - mouseDragged() : 마우스가 드래그되는 동안 계속 여러번 호출  
 - 마우스가 눌러진 위치에서 떼어지는 경우 메소드 호출 순서  
   - mousePressed(), mouseReleased(), mouseClicked()  
 - 마우스가 드래그될 때 호출 되는 메소드 호출 순서  
   - mousePressed(), mouseDragged(), mouseReleased()  
#### 마우스 리스너 달기와 MouseEvent 객체 활용  
##### 마우스 리스너 달기  
 - 마우스 리스너는 컴포넌트에 다음과 같이 등록  
    - 예 : component.addMouseListener(myMouseListener);  
 - 컴포넌트가 마우스 무브(mouseMoved())나 마우스 드래깅(mouseDraggecd())을 함께 처리하고자 하면, MouseMotion 리스너 따로 등록  
    - 예 : component.addMouseMotionListener(myMouseMotionListener);  
##### MouseEvent 객체 활용  
  - 마우스 포인터의 위치, 컴포넌트 내 상대 위치  
    - 예 : int getX(), int getY()  
      public void mousePressed(MouseEvent e) {  
          int x = e.getX(); //마우스가 눌러진 x 좌표  
          int y = e.getY(); //마우스가 눌러진 y 좌표
      }  
  - 마우스 클릭 횟수  
    - 예 : int getClickCount()  
      public void mouseClicked(MouseEvent e) {  
        if(e.getClickCount() == 2) {  
          ...// 더블클릭 처리 루틴  
        }  
      }
      



## 5월 17일 강의
#### 컨테이너와 배치, 배치관리자 개념
##### 컨테이너의 배치관리자  
 1. 컨테이너마다 하나의 배치관리자 존재  
 2. 컨테이너에 부착되는 컴포넌트의 위치와 크기 결정  
 3. 컨테이너의 크기가 변경되면, 컴포넌트의 위치와 크기 재결정  
##### 배치 관리자 대표 유형 4가지  
 - FlowLayout 배치관리자  
  1. 컴포넌트가 삽입되는 순서대로 왼쪽에서 오른쪽으로 배치  
  2. 배치할 공간이 없으면 아래로 내려와서 반복한다.  
 - BorderLayout 배치관리자  
  1. 컨테이너의 공간을 동(EAST),서(WEST),남(SOUTH),북(NORTH),중앙(CENTER)의 5개 영역으로 나눔  
  2. 5개 영역 중 응용프로그램에서 지정한 영역에 컴포넌트 배치  
 - GridLayout 배치관리자  
  1. 컨테이너를 프로그램에서 설정한 동일한 크기의 2차원 격자로 나눔  
  2. 컴포넌트는 삽입 순서대로 좌에서 우로, 다시 위에서 아래로 배치  
 - CardLayout  
  1. 컨테이너의 공간에 카드를 쌓아 놓은 듯이 컴포넌트를 쪼개어 배치  
##### 컨테이너와 디폴트 배치관리자  
  - 컨테이너 생성시 자동으로 생성되는 배치관리자  
    - AWT와 스윙 컨테이너 -- 디폴트 배치관리자  
    1. Window , JWindow -- BorderLayout  
    2. Frame,JFrame -- BorderLayout  
    3. Dialog,JDialog -- BorderLayout  
    4. Panel,JPanel -- FlowLayout  
    5. Applet,JApplet -- FlowLayout  
##### 컨테이너에 새로운 배치관리자 설정  
 - 컨테이너에 새로운 배치관리자 설정  
   1. setLayout(LayoutManger lm) 메소드 호출  
    - lm을 새로운 배치관리자로 설정  
     - 사례 : JPanel 컨테이너에 BorderLayout 배치관리자를 설정하는 예  
       - ex: JPanel p = new JPanel();  
             p.setLayout(new BorderLayout()); // JPanel에 BorderLayout 설정  
    - 컨텐트팬의 배치관리자를 FlowLayout 배치관리자로 설정  
       - ex: Container c = Frame.getConentPane(); // 프레임의 컨텐트팬 알아내기  
             c.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 설정  
##### FlowLayout 배치관리자  
 - 배치방법  
   - 컴포넌트를 컨테이너 내에 왼쪽에서 오른쪽으로 배치(다시 위에서 아래로 순서대로 배치)  
##### FlowLayout의 생성자  
 - 생성자  
   - FlowLayout()  
   - FlowLayout(int align, int hGap, int vGap)  
     1. align : 컴포넌트를 정렬하는 방법 지정. 왼쪽 정렬(FlowLayout.LEFT), 오른쪽 정렬(FlowLayout.RIGHT), 중앙 정렬(FlowLayout.CENTER(디폴트))  
     2. hGap : 좌우 두 컴포넌트 사이의 수평 간격,픽셀 단위, 디폴트는 5  
     3. vGap : 상하 두 컴포넌트 사이의 수직 간격,픽셀 단위, 디폴트는 5  
##### BorderLayout 배치관리자  
 - 배치방법  
   - 컨테이너 공간을 5구역으로 분할 배치 ( 동, 서, 남, 북, 중앙)  
   - add(Component comp, int index) - comp를 index의 공간에 배치  
##### BorderLayout 생성자와 add() 메소드  
 - 생성자  
   - BorderLayout()  
   - BorderLayout(int hGap, int vGap)  
     - hGap : 좌우 두 컴포넌트 사이의 수평 간격,픽셀 단위(디폴트 : 0)
     - vGap : 상하 두 컴포넌트 사이의 수직 간격,픽셀 단위(디폴트 : 0)  
 - add()메소드  
   - void add(Component comp, int index)  
     - comp 컴포넌트를 index위치에 삽입한다.  
     - index : 컴포넌트의 위치  동:BorderLayout.EAST 서:BorderLayout.WEST 남:BorderLayout.SOUTH  
                               북:BorderLayout.NORTH 중앙:BorderLayout.CENTER  
##### GridLayout 배치관리자  
  - 배치방법  
    - 컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고 각 셀에 컴포넌트 하나씩 배치  
      - 생성자에 행수와 열수 지정  
      - 셀에 왼쪽에서 오른쪽으로, 다시 위에서 아래로 순서대로 배치  
##### GridLayout 생성자  
  - 생성자  
    - GridLayout()  
    - GridLayout(int rows, int cols)  
    - GridLayout(int rows, int cols, int hGap, int vGap)  
      - rows : 격자의 행수(디폴트 : 1)  
      - cols : 격자의 열수(디폴트 : 1)  
      - hGap : 좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위(디폴트 : 0)  
      - vGap : 상하 두 컴포넌트 사이의 수직 간격, 픽셀 단위(디폴트 : 0)  
      - rows x cols 만큼의 셀을 가진 격자로 컨테이너 공간을 분할,배치  
##### 배치관리자 없는 컨테이너  
  - 배치관리자 없는 컨테이너가 필요한 경우  
    - 응용프로그램에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우  
      1. 컴포넌트의 크기나 위치를 개발자 임의로 결정하고자 하는 경우  
      2. 게임 프로그램과 같이 시간이나 마우스/키보드의 입력에 따라 컴포넌트들의 위치와 크기가 수시로 변하는 경우  
      3. 여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우  
  - 컨테이너의 배치 관리자 제거 방법  
    - container.setLayout(null);  -- JPanel p = new JPanel();  
                                     p.setLayout(null); // JPanel의 배치관리자 삭제  
    - 컨테이너의 배치관리자가 없어지면, 컴포넌트에 대한 어떤 배치도 없음  
      - 추가된 컴포넌트의 크기가 0으로 설정, 위치는 예측할 수 없게 됨  
        - //패널 p에는 배치관리자가 없으면 아래 두 버튼은 배치되지 않는다.  
          p.add(new JButton("click)); // 폭과 높이가 0인 상태로 화면에 보이지 않는다.  
          p.add(new JButton("me!)); //폭과 높이가 0인 상태로 화면에 보이지 않는다.  
##### 컴포넌트의 절대 위치와 크기 설정  
  - 배치관리자가 없는 컨테이너에 컴포넌트를 삽입할 때  
    - 프로그램에서 컴포넌트의 절대 크기와 위치 설정  
    - 컴포넌트들이 서로 겹치게 할 수 있음  
  - 컴포넌트의 크기와 위치 설정 메소드  
    - void setSize(int width, int height) //컴포넌트 크기 설정  
    - void setLocation(int x, int y)  //컴포넌트 위치 설정  
    - void setBounds(int x, int y, int width, int height) //위치와 크기 동시 설정  
    
 

## 5월 3일 강의 
### 7단원. 컬렉션과 제네릭  
#### 컬렉션의 개념  
##### 컬렉션 - 요소 라고 불리는 가변 개수의 객체들의 저장소  
 1. 객체들의 컨테이너라고도 불림  
 2. 요소의 개수에 따라 크기 자동 조절  
 3. 요소의 삽입,삭제에 따른 요소의 위치 자동 이동  
 4. 고정 크기의 배열을 다루는 어려움 해소  
 5. 다양한 객체들의 삽입,삭제,검색 등의 관리 용이  
#### 컬렉션의 특징  
##### 1.컬렉션은 제네릭 기법으로 구현    
 1. 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화시키는 기법  
 2. 클래스나 인터페이스 이름에 E,K,V 등 타입매개변수 포함  
##### 2.제네릭 컬렉션 사례 : Vector - E  
 1. E에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용  
 2. 정수만 다루는 컬렉션 벡터 Vector(Integer)  
 3. 문자열만 다루는 컬렉션 벡터 Vector(String)  
##### 3.컬렉션의 요소는 객체만 가능  
 1. int,char,double 등의 기본타입으로 구체화 불가  
##### 제네릭은 형판과 같은 개념  
 1. 제네릭 - 클래스나 메소드를 형판엣어 찍어내듯이 생산할 수 있도록 일반화된 형판을 만드는 기법  
 2. JDK 1.5부터 도입(2004 기점) , 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 타입 매개 변수로 클래스(인터페이스)나 메소드를 작성하는 기법 , C++의 템플릿과 동일  
##### 벡터 Vector<.E.>의 특성  
 1. <.E.>에 사용할 요소의 특정타입으로 구체화  
 2. 배열을 가변 크기로 다룰 수 있게 하는 컨테이너  
2.1 배열의 길이 제한 극복  
2.2 요소의 개수가 넘치면 자동으로 길이 조절  
 3. 요소 객체들을 삽입,삭제,검색하는 컨테이너  
3.1 삽입,삭제에 따라 자동으로 요소의 위치 조정  
 4. Vector에 삽입 가능한 것  
4.1 객체,null  
4.2 기본 타입의 값은 Wrapper 객체로 만들어 저장  
 5. Vector에 객체 삽입  
5.1 벡터의 맨 뒤, 중간에 객체 삽입 가능  
 6. Vector에서 객체 삭제  
6.1 임의의 위치에 있는 객체 삭제 가능  
##### 컬렉션과 자동 박싱/언박싱  
##### JDK 1.5 이전  
 1. 기본타입 데이터를 Wrapper 객체로 만들어 삽입  
 2. 컬렉션으로부터 요소를 얻어올 때, Wrapper 클래스로 캐스팅 필요  
##### JDK 1.5 부터  
 1. 자동 박싱/언박싱이 작동하여 기본 타입 값 삽입 가능  
##### ArrayList <.E>  
 1. 가변 크기 배열을 구현한 클래스  
 2. 벡터와 거의 동일  
##### 렉션의 순차 검색을 위한 Iterator  
##### iterator<.e> 인터페이스  
 1. 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 인터페이스  
##### iterator 객체 얻어내기  
 1. 컬렉션의 iterator() 메소드 호출  
 2. 컬렉션 검색 코드  
##### HashMap<.K,V>  
- 키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션  
 1. K:키로 사용할 요소의 타입  
 2. V:값으로 사용할 요소의 타입      
 3. 키와 값이 한쌍으로 삽입  
 4. 값을 검색하기 위해서는 반드시 키 이용  
  - 삽입 및 검색이 빠른 특징  
    - 요소 삽입 : put() 메소드  
    - 요소 검색 : get() 메소드  
#### 제네릭 만들기  
##### 제네릭 클래스 작성  
 1. 클래스 이름 옆에 일반화된 타입 매개 변수 추가  
 2. 제네릭 객체 생성 및 활용  
### 8단원 자바 GUI 스윙 기초  
#### 자바의 GUI  
##### GUI 응용 프로그램  
- GUI
 1. 사용자가 편리하게 입출력 할 수 있도록 그래픽으로 화면을 구성하고, 마우스나 키보드로 입력받을 수 있도록 지원하는 사용자 인터페이스
- 자바언어에서의 GUI 응용프로그램 작성  
 1. AWT와 Swing 패키지에 강력한 GUI 컴포넌트 제공  
 2. 쉬운 GUI 프로그래밍  
##### AWT와 Swing 패키지  
- AWT 패키지  
 1. 자바가 처음 나왔을 때부터 배포된 GUI패키지, 최근에는 거의 사용하지 않음  
 2. AWT 컴포넌트는 중량 컴포넌트(heavy weight component)  
##### Swing 패키지  
 1. AWT기술을 기반으로 작성된 자바 라이브러리  
 2. 모든 AWT기능 + 추가된 풍부하고 화려한 고급 컴포넌트  
 3. AWT 컴포넌트를 모두 스윙으로 재작성,AWT 컴포넌트 이름 앞에 j자를 덧붙임  
 4. 순수 자바 언어로 구현  
 5. 스윙 컴포넌트는 경량 컴포넌트  
 6. 현재 자바의 GUI로 사용됨  
##### 컨테이너와 컴포넌트  
- 컨테이너  
 1. 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트   
 2. 다른 컨테이너에 포함될 수 있음  
##### 컴포넌트  
 1. 컨테이너에 포함되어야 화면에 출력될 수 있는 GUI 객체  
 2. 다른 컴포넌트를 포함할 수 없는 순수 컴포넌트  
 3. 모든 GUI 컴포넌트가 상속받는 클래스 : java.awt.Component  
 4. 스윙 컴포넌트가 상속받는 클래스 : javax.swing.JComponent  
##### 최상위 컨테이너  
 1. 다른 컨테이너에 포함되지 않고도 화면에 출력되며 독립적으로 존재 가능한 컨테이너  
##### 스윙 GUI 프로그램 만들기  
- 스윙 GUI 프로그램을 만드는 과정  
 1. 스윙 프레임 만들기  
 2. main() 메소드 작성  
 3. 스윙 프레임에 스윙 컴포넌트 붙이기  
##### 스윙 프로그램 작성에 필요한 import문  
 1. import java.awt.*; //그래픽 처리를 위한 클래스들의 경로명  
 2. import java.awt.event.*; //AWT 이벤트 사용을 위한 경로명  
 3. import javax.swing.*; //스윙 컴포넌트 클래스들의 경로명  
 4. import javax.swing.event.*; //스윙 이벤트를 위한 경로명  
##### 스윙 프레임  
- 스윙 프레임 : 모든 스윙 컴포넌트를 담는 최상위 컨테이너  
 1. JFrame을 상속받아 구현  
 2. 컴포넌트들은 화면에 보이려면 스윙 프레임에 부착되어야 함  
##### 스윙 프레임 기본 구성  
 1. 프레임 - 스윙 프로그램의 기본 틀  
 2. 메뉴바 - 메뉴들이 부착되는 공간  
 3. 컨텐트팬 - GUI 컴포넌트들이 부착되는 공간  
##### 프레임 만들기, JFrame 클래스 상속  
- 스윙 프레임  
 1. jframe 클래스를 상속받은 클래스 작성  
 2. 프레임의 크기 반드시 지정 : setSize()호출  
 3. 프레임을 화면에 출력하는 코드 반드시 필요 : SetVisible(true) 호출  
##### 스윙 응용프로그램에서 main()의 기능과 위치  
- 스윙 응용프로그램에서 main()의 기능 최소화 바람직  
 1. 스윙 응용프로그램이 실행되는 시작점으로서의 기능만  
 2. 스윙 프레임을 생성하는 정도의 코드로 최소화  
##### 프레임에 컴포넌트 붙이기  
- 타이틀 달기  
 1. super()나 setTitle() 이용  
##### 컨텐트팬에 컴포넌트 달기  
 1. 컨텐트팬이란? 스윙 컴포넌트들이 부착되는 공간  
##### 스윙 응용프로그램의 종료  
- 응용프로그램 내에서 스스로 종료하는 방법  
 1. System.exit(0); 1.언제 어디서나 무조건 종료  
- 프레임의 오른쪽 상단의 종료버튼(X)이 클릭되면 어떤 일이 일어나는가?  
 1. 프레임 종료, 프레임 윈도우를 닫음 - 프레임이 화면에서 보이지 않게 됨  
 2. 프레임이 보이지 않게 되지만 응용프로그램이 종료한 것 아님  
   - 키보드나 마우스 입력을 받지 못함  
   - 다시 setVisible(true)를 호출하면, 보이게 되고 이전 처럼 작동함  
 3. 프레임 종료버튼이 클릭될 때,프레임과 함께 프로그램을 종료시키는 방법  
- frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



## 4월 19일 강의
5.7 추상 클래스 - 상속에서 추상 클래스는 중요한 슈퍼 클래스의 역할을 한다.  
추상 메소드 - abstract 키워드와 함께 원형만 선언되고, 코드는 작성되지 않은 메소드이다.  
ex) abstract public String getName(); //추상 메소드  
추상 클래스 선언 - abstract로 선언한 클래스로서 두가지 경우가 있다.  
1.추상 메소드를 최소 한 개 이상 가지고 abstract로 선언된 클래스  
2.추상 메소드가 없어도 abstract로 선언한 클래스  
추상 클래스의 인스턴트를 생성할 수 없다.  
응용프로그램에서는 추상 클래스의 인스턴스(객체)를 생성할 수 없다.이는 추상 클래스 실행 코드가 없는 미완성 상태인 추상 메소드가 있을 수 없기 때문이다.  
추상 클래스 상속과 구현  
o추상 클래스의 상속  
추상 메소드를 가진 추상 클래스를 상속받는 서브 클래스는 자동으로 추상 클래스가 된다. 이는 추상 메소드를 상속받기 때문이다.  
ex) abstract class A { //추상 클래스
      abstract public int add(int x, int y); //추상 메소드
      }  
o추상 클래스의 구현 - 서브 클래스에서 슈퍼 클래스의 모든 추상 메소드를 오버라이딩하여 실행 가능한 코드로 구현하는 것을 말한다.  
o추상 클래스의 목적 - 객체(인스턴스)를 생성하기 위함이 아니며, 상속을 위한 슈퍼 클래스로 활용하기 위한 것이다. 추상 클래스는 추상 메소드를 통해 서브 클래스가 구현할 메소드의 원형을 알려주는 인터페이스의 역할을 하고, 서브 클래스의 다형성을 실현한다.  
5.8 인터페이스  
인터페이스는 RS-232 인터페이스, USB 인터페이스, SATA 인터페이스 하드디스크 등 컴퓨터 주변 장치에서 많이 듣던 용어이다. 여기서 인터페이스는 서로 다른 하드웨어 장치들이 상호 데이터를 주고 받을 수 있는 규격을 의미한다.  
O자바 인터페이스란? 인터페이스의 개념은 소프트웨어에서도 적용된다. 소프트웨어를 규격화된 모듈로 만들고, 인터페이스가 맞는 모듈을 조립하듯이 응용프로그램을 작성할 수 있다.  
인터페이스는 객체를 생성할 수 없고, 인터페이스는 다른 인터페이스를 상속할 수 있으며, 인터페이스 구현이란 implements 키워드를 사용한다.  
6.1 패키지  
패키지 - 서로 관련 있는 클래스나 인터페이스의 컴파일된 클래스(.class) 파일들을 하나의 디렉터리에 모아놓은 것.  
모듈 - 여러 개의 패키지들을 모은 것  
모듈화의 목적  
1.java9부터 자바api를 여러 모듈(99개)로 분할  
2.응용프로그램이 실행할 때 꼭 필요한 모듈들로만 실행 환경 구축  
모듈의 현실  
1.java9부터 전면적 도입  
2.복잡한 개념  
3.큰 자바 응용프로그램에는 개발 유지보수 등에 적합  
4.현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요 없음  
패키지 사용하기, import문  
자바 소스 코드에서 다른 패키지에 있는 클래스를 사용하고자 한다면, 패키지명을 포함하는 경로명을 사용하여, 컴파일러로 하여금 클래스 파일의 위치를 찾을 수 있도록 해야 한다. 다음은 jdk에서 제공하는 Scanner 클래스를 사용하기 위해,완전 경로명인 java.util.Scanner를 사용한 코드이다.  
6.3 모듈 개념  
모듈 - JAVA9에서 처음 도입된 개념으로, 패키지가 서로 관련 있는 클래스나 인터페이스의 컴파일된 클래스 파일들을 한 곳에 담는 컨테이너라면, 모듈은 패키지들을 담는 컨테이너로 모듈 파일로 저장한다.  
자바 플랫폼의 모듈화  - 모듈 중에서 꼭 필요한 기본 모듈이 JAVA.BASE 모듈이다.  
6.4 자바 jdk에서 제공하는 패키지  
jdk 패키지 계층 구조  - 자바 개발 도구인 JDK는 화면출력,키입력,네트워킹 등 프로그램 개발에 필요한 기본적인 기능과 다양한 응용 기능을 구현한 많은 클래스와 인터페이스들을 포함하는 표준 패키지를 제공하며,이를 자바 API라고 한다.  
jdk의 주요 패키지 - java.lang - System, java.util , java.io , java.awt - GUI , javax.swing  
6.5 object 클래스  
object는 java.lang 패키지에 속한 클래스이며, 모든 클래스는 강제로 object를 상속받는다. object 만이 유일하게 아무 클래스도 상속받지 않는, 자바 클래스 계층 구조의 최상위 클래스이다.  
o객체 속성 object 클래스의 hashcode(), toString() 메소드는 객체의 해시코드 값,객체를 나타내는 문자열 정보를 제공한다.  
o toString() 메소드, 객체를 문자열로 변환 - object에는 객체를 문자열로 변환하는 toString()이 있으며, 각 클래스는 toString()을 오버라이딩하여 자신만의 문자열을 리턴할 수 있다.  
o객체 비교와 equals() 메소드 - 프로그램을 작성하다보면 두 객체가 같은지 비교할 경우가 자주 있다. 기본 타입의 값을 비교하기 위해서는 ==연산자를 사용하지만, 객체 비교를 위해 ==연산자를 사용하면 잘못된 결과를 ㅏㄶ을 수 있다. 객체 비교를 위해서는 equals() 메소드를 사용해야 한다  
6.6 Wrapper 클래스  
개념 - 8개의 기본타입을 객체로 다루기 위해 Byte, short 등의 8개의 클래스를 통칭하여 Wrapper 클래스 라고 말한다.자바는 객체 지향 언어이므로 기본적으로 객체를 대상으로 처리하는 경우가 많다.  
객체 생성 ex) Integer i = Integer.valueOf(10); //정수 10의 객체화  
객체 활용 - 기본 타입 값을 문자열로 변환하거나, 문자열을 기본 타입 값으로 변환하는 메소드들이 주를 이루고 있다.  
박싱과 언박싱 - 기본 타입의 값을 Wrapper 객체로 변환하는 것을 박싱 이라고 하고, 반대의 경우를 언박싱 이라고 한다.  
Integer ten = Integer.valueOf(10); //박싱  
int n = ten.intValue(); //언박싱  
6.7 String과 StringBuffer 클래스  
String 의 생성과 특징 - String 클래스는 문자열을 나타내며, 스트링 리터럴은 String 객체로 처리된다.  
-스트링 리터럴과 new String()  스트링 리터럴과 new String()으로 생성된 스트링은 서로 다르게 관리된다. 스트링 리터럴은 자바 내부에서 리터럴 테이블로 특별히 관리하여, 동일한 리터럴은 공유시킨다.  
-스트링 객체는 수정이 불가능하다.  
o String 활용 - 스트링은 많이 사용되므로 String 클래스의 활용은 중요하다.   
o 공백 제거, trim() - 키보드나 파일로부터 스트링을 입력받을 때, 스트링 앞뒤에 공백이 끼는 경우가 있다.  
StringBuffer 클래스 - 스트링을 다루는 클래스로서, 내부에 가변 크기의 버퍼를 가지고 문자의 개수에 따라 버퍼 크기를 자동 조절한다.  
6.8 StringTokenizer 클래스 - 문자열을 분리하기 위해 사용한다. 문자열을 분리할 때 사용되는 기준 문자를 구분 문자라고 하고 구분 문자로 분리된 문자열을 토큰이라고 한다.  
6.9 math 클래스 - 기본적인 산술 연산을 수행하는 메소드를 제공하는 클래스로서, 모든 메소드가 static 타입이기 때문에 'Math.메소드' 형태로 사용할 수 있다.

## 4월 12일 강의 
4.8-1 static 멤버 사용  
non-static 멤버가 객체 이름으로만 활용할 수 있는 것과는 달리, static 멤버는 객체 이름이나 클래스 이름으로 모두 활용할 수 있다.  
4.8-2 static의 활용  
 -1.전역변수와 전역함수를 만들 때 활용  
응용프로그램 작성 시 모든 클래스에서 공유하는 전역 변수나 모든 클래스에서 호출할 수 있는 전역 함수를 만들고자 할때 static으로 선언하면 된다.  
 -2.공유 멤버를 만들고자 할 때 활용  
static으로 선언된 필드나 메소드는 이 클래스의 객체들 사이에서 공유된다.  
4.8-3 static 메소드의 제약조건  
static 메소드는 2가지 제약조건을 가짐.  
 -1.static 메소드는 오직 static 멤버만 접근할 수 있다.  
static 메소드는 객체가 생성되지 않은 상황에서도 사용이 가능하므로 객체에 속한 인스턴트 메소드, 인스턴트 변수 등을 사용할 수 없고, static 멤버들만 사용 가능하다. 그러나 인스턴스 메소드는 static 멤버들을 사용할 수 있다.  
 -2.static메소드에서는 this를 사용할 수 없다.  
static 메소드는 객체 없이도 존재하기 때문에, static 메소드에서 this를 사용할 수 없다.  
static 메소드 오류의 예 - static void f() {this.n = x;} // 오류 static 메소드에서는 this 사용 불가능
4.9 final  
final 키워드는 3가지 용도로 사용됨  
 -1.final 클래스  
final이 클래스 이름 앞에 사용되면 클래스를 상속받을 수 없음을 지정한다.  
 -2.final 메소드   
메소드 앞에 final이 붙으면 이 메소드는 더 이상 오버라이딩할 수 없음을 지정한다. 자식클래스가 부모 클래스의 특정 메소드를 오버라이딩하지 못하게 하고 무조건 상속 받아 사용하도록 하고자 한다면 final로 지정하면 된다.  
 -3.final 필드  
자바에서 final 필드를 선언하면 필드는 상수가 된다.  
CHAPTER05 상속  
5.1 상속의 개념  - 객체 지향 언어에서의 상속은 부모유전자를 자식이 물려받는 유전적 상속과 유사하다.  
5.1-1상속의 장점   
 -1.클래스 사이의 멤버 중복 선언 불필요 - 클래스의 간결화  
 -2.클래스들의 계층적 분류로 클래스 관리 용이  
 -3.클래스 재사용과 확장을 통한 소프트웨어의 생산성 향상   
5.2 클래스 상속과 개체  
5.2-1자바의 상속 선언   
자바에서는 extends 키워드를 사용하여 상속을 선언한다. 자바에서는 상속하는 부모 클래스를 슈퍼 클래스, 상속받는 자식 클래스를 서브 클래스 라고 부른다.  
(x,y) 좌표를 가진 한 점을 표현하는 point 클래스와 이를 상속받아 색깔을 추가한 ColorPoint 클래스를 선언하는 예시  
class point {
  int x, y;
} 
class ColorPoint extends point {
  String color;
}  
5.2-2상속과 객체  
 -1.상속 선언 - point를 상속받는 colorpoint의 상속 선언의 예시  
ex) class ColorPoint extends Point { ... }  
 -2.서브클래스 객체 생성 - point클래스의 객체 p와 colorpoint 클래스의 객체 cp는 다음과 같이 생성  
ex) point p = new point();   
    color point cp = new colorpoint();  
상속에서 일차적으로 이해해야 하는 것은 바로 서브 클래스 객체의 모양이다. 객체 p , cp 는 별개의 객체이며 p는 point 클래스의 멤버만 가지고, cp는 point colorpoint 멤버를 모두 가진다.  
 -3.서브클래스 객체 활용  
외부에서 colorpoint 클래스의 public 멤버와 슈퍼클래스 point의 public 멤버를 모두 접근할 수 있다. 그러나 x,,y color는 private 속성이므로 외부에서 접근할 수 없다.  
 -4.서브 클래스에서 슈퍼 클래스 멤버 접근  
서브클래스는 슈퍼클래스의 private 멤버 외 모든 멤버를 접근할 수 있다. x, y는 point의 private 멤버이므로, colorpoint 클래스의 멤버들이 접근할 수 없다. x, y는 오직 set()과 showpoint()만 접근이 허용된다. 
5.2-3 자바 상속의 특징    
 -1.자바에서는 클래스의 다중 상속을 지원하지 않는다. 자바는 C++와 달리 클래스를 여러 개 상속받는 다중 상속(multiple inheritance)을 지원하지 않는다. 다중 클래스 상속은 여러가지 문제점을 가지고 있기 때문이다.  
 -2.자바의 모든 클래스는 자바에서 제공하는 object 클래스를 자동으로 상속받도록 컴파일 된다.  
  
5.3 protected 접근 지정  
자바의 접근 지정자는 private, public, protected, 디폴트 4가지로서 모든 멤버는 이중 하나로 반드시 지정되어야 한다.  
o 슈퍼 클래스의 디폴트 멤버에 대한 서브 클래스의 접근  
접근 지정자가 선언되어 있지 않을 때, 디폴트 접근 지정이라 부르며, 슈퍼 클래스의 디폴트 멤버는 동일한 패키지에 있는 클래스들에게만 접근이 허용된다. 만일 서브 클래스가 슈퍼 클래스와 다른 패키지에 있다면, 슈퍼 클래스의 디폴트 멤버를 접근할 수 없다.  
o protected 멤버  
슈퍼 클래스의 protected 멤버는 다음 두 가지 경우에 접근이 허용된다  
 -1.같은 패키지에 속한 모든 클래스  
 -2.상속되는 서브 클래스(같은 패키지든 다른 패키지든 상관 없음)  
5.4 상속과 생성자  
o 서브 클래스와 슈퍼 클래스의 생성자 호출 및 실행  
서브 클래스와 슈퍼 클래스 모두 생성자를 가지고 있다.   
o 서브 클래스에서 슈퍼 클래스 생성자 선택  
 -1.슈퍼 클래스의 기본 생성자가 묵시적으로 선택  
개발자의 명시적 지시가 없으면, 서브 클래스의 생성자가 기본 생성자이든 매개 변수를 가진 것이든, 슈퍼 클래스의 생성자로 기본 생성자가 선택된다.이 선택은 자바 컴파일러에 의해 묵시적으로 이루어진다.  
 -2.super()를 이용하여 명시적으로 슈퍼 클래스의 생성자 선택  
서브 클래스의 생성자에서 슈퍼 클래스의 생성자를 명시적으로 선택하는 것이 원칙이다. super()를 이용하면, 서브 클래스의 생성자에서 슈퍼 클래스 생성자를 명시적으로 선택할 수 있다. super()는 슈퍼클래스의 생성자의 호출을 의미한다.  
5.5 업캐스팅과 instanceof 연산자  
업캐스팅 - 서브클래스 객체가 슈퍼 클래스 타입으려 변환되는 것  
업캐스팅 코드 사례 - person p;  
                    Student s = new Student();  
                    p = s;   슈퍼 클래스의 레퍼런스p가 서브클래스 객체를 가리키도록 치환하는 것이 업캐스팅이다.  
다운캐스팅 - 업캐스팅된 것을 다시 원래대로 되돌리는 것을 다운캐스팅 이라고 한다.  
ex ) Person p = new student("이재문"); // 업캐스팅 Student s = (Student)p; // 다운캐스팅, (student)의 타입 변환을 반드시 지정  
instanceof 연산자와 객체 구별  
업캐스팅을 한 경우 레퍼런스가 가리키는 객체의 진짜 클래스 타입을 구분하기 어렵다.  
instanceof 연산자 사용  
레퍼런스가 가리키는 객체가 어떤 클래스 타입인지 구분하기 위해, 자바에서는 instanceof연산자를 두고 있다.   
5.6 메소드 오버라이딩  
메소드 오버라이딩은 서브 클래스에서 슈퍼 클래스에 선언된 메소드를 중복 작성하여 슈퍼 클래스에 작성된 메소드를 무력화시키고, 객채의 주인 노릇을 하는 것이다.  
-- 오버라이딩의 목적, 다형성 실현  
오버라이딩은 상속을 통해 '하나의 인터페이스(같은 이름)에 서로 다른 내용 구현' 이라는 객체 지향의 다향성을 실현하는 도구이다.  
동적 바인딩 - 실행할 메소드를 컴파일 시에 결정하지 않고 실행 시에 결정하는 것을 말한다. 자바에서는 동적 바인딩을 통해 오버라이딩 된 메소드가 항상 실행되도록 보장한다.  
ex ) SuperObject a = new SuperObject();
     a.paint(); // paint()는 SuperObject의 draw()를 호출한다.  
오버라이딩과 super 키워드  
클래스에서 super 키워드를 이용하면 정적 바인딩을 통해 슈퍼클래스의 멤버에 접근할 수 있다.  
오버로딩과 오버라이딩  
오버라이딩은 슈퍼 클래스에 있는 메소드와 이름, 매개 변수 타입과 개수, 리턴 타입 등이 모두 동일한 메소드가 서브 클래스에 재정의되었을 경우이며, 오버로딩은 한 클래스나 상속 관계에 있는 클래스에 서로 매개 변수의 타입이나 개수가 다른 여러개의 메소드가 같은 이름으로 작성되는 것을 지칭한다.  
5.7 추상 클래스  
추상 메소드 - abstract 키워드와 함께 원형만 선언되고, 코드는 작성되지 않은 메소드이다.  

## 4월 5일 강의
3.4 다차원 배열  
O 다차원 배열 - 자바에서는 여러 차원의 배열을 만들 수 있으며, 일반적으로 3차원 이상의 배열은 잘 사용하지 않기 때문에 이 책에서는 2차원 배열만 다룬다.
  -- 2차원 배열 : 2차원 배열의 선언과 생성  
2차원 배열 래퍼런스 변수 선언 : int intArray[][]; 또는 intArray;  
2행 5열의 2차원 배열 생성 : intArray = new int[2][5]; -> 첫번째 []는 행의 개수, 두 번째 []는 열의 개수를 나타냄  
열 선언과 생성을 동시에 하는 법 : int intArray[][] = new int[2][5];  
2차원 배열의 초기화 : 2차원 배열을 선언할 때 각 원소를 초기화 할 수 있다.  
        int intArray[][] = { {0,1,2}, {3,4,5}, {6,7,8} }; // 3x3 배열 생성
          chat chatArray[][] = { {'a','b','c'}, {'d','e','f'} }; //2x3 배열 생성
          double doubleArray[][] = { {0.01,0.02}, {0.03,0.04} }; //2x2 배열 생성   
  3.5 메소드의 배열 리턴   
  O 메소드의 배열 리턴 - 메소드가 배열을 리턴하는 경우, 배열 메모리 전체가 아닌 배열에 대한 리퍼런스만 리턴됨.    
makeArray()로부터 배열을 리턴받는 경우 - int[] intArray; // makeArray()의 리턴타입과 동일한 타입선언 intArray = makeArray(); // 메소드가 리턴하는 배열 받음  
  3.6 자바의 예외 처리  
  O 자바 예외 처리, 예외란? 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생을 예외(exception)라고 한다. 사용자의 잘못된 입력이나 배열의 인덱스가 배열의 크기를 넘어가는 등의 사건에 의해 프로그램 실행 중에 발생한다.     
예외 발생 경우 3가지 - 1.정수를 0으로 나누는 경우 ,   2.배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우   3.정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우

4.1 객체 지향과 자바  
O 자바의 객체지향 특성
  --캡슐화 - 객체률 캡슐로 싸서 내부를 볼 수 없게 하는 것  
객체의 가장 본질적인 특징 - 외부의 접근으로부터 객체 보호 ,   자바의 캡슐화 - 클래스:객체 모양을 선언한 툴   객체:생성한 실체  
--자바 상속 - 상의 클래스의 멤버를 하위 클래스가 물려받음   
                        - 상위 클래스 : 수퍼 클래스  
                         - 하위 클래스 : 서브 클래스  
  --다형성 - 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것.
          슈퍼 클래스에 구현된 메소드를, 서브 클래스에서 자신의 특징에 맞게 동일한 이름으로 다시 구현하는 이른바 메소드 오버라이딩(overriding)으로 부른다. 다형성의 또 다른 사례는 클래스 내에서 같은 이름의 메소드를 여러 개 만드는 메소드 오버로딩(overloading)이 있다.    
O 객체 지향 언어의 목적  
--소프트웨어의 생산성 향상  
--실세계에 대한 쉬운 모델링  
O 절차 지향 프로그래밍과 객체 지향 프로그래밍     
 -C언어처럼 실행하고자 하는 절차를 정하고, 이 절차대로 프로그래밍하는 방법을 절차지향 프로그래밍이라고 부른다. 절차 지향 프로그래밍은 목적을 달성하기 위한 일의 흐름에 중점을 둠.  
  -절차지향언어로는 실세계의 문제를 프로그래밍하기에는 표현에 한계가 있다. 객체지향 프로그래밍은 이러한 단점을 극복하고 실세상의 물체를 객체로 표현하고, 이들 사이의 관계,상호 작용을 프로그램을 나타낸다.    
O 클래스와 객체   
   자바를 비롯한 객체지향언어에서 클래스는 객체를 만들어 내기 위한 설계 혹은 틀이며, 클래스에 선언된 모양 그대로 생성된 실체가 객체이다. 이러한 연유로 객체를 클래스의 인스턴스(instance)라고도 부르며, 가끔 객체와 인스턴스는 구별 없이 사용한다.  
4.2 자바 클래스 만들기  
O 자바 클래스 구성 - 자바에서 class 키워드로 클래스를 선언한다. 클래스는 c언어의 구조체와 같이 개발자가 정의하는 새로운 데이터 타입이다. 클래스의 구성요소를 멤버라고 부르며 멤버는 필드(멤버변수)와 메소드(멤버 함수)의 두가지 이다.    
 -클래스 구성 : 클래스는 class키워드와 클래스 이름으로 선언하고 중괄호({})안에 클래스의 필드와 메소드를 모두 작성해야 한다. 클래스 외부에 필드나 메소드를 결코 둘 수 없다.  
 -클래스 멤버 : 클래스의 멤버는 필드와 메소드로서, 필드는 객체의 상태 값을 저장할 멤버 변수이며, 메소드는 실행 가능한 함수이고 객체의 행위를 구현한다. getArea()메소드는 원 내부의 반지름 정보를 이용하여 면적을 계산하여 알려준다.    
 -접근 지정자 : 클래스의 선언부 앞에 붙여진 public은 접근지정자로서, circle 클래스를 다른 클래스에서 이용할 수 있음을 지정한다. 멤버를 public으로 선언하면 다른 클래스에서 마음대로 호출하거나 접근할 수 있도록 공개한다는 뜻이다.    
 O 객체 생성과 활용    
  객체를 생성하는과정은 객체에 대한 래퍼런스 변수 선언과 객체 생성의 두 과정으로 구분된다.    
  1. 래퍼런스 변수 선언 - 객체를 생성하기 전 객체를 가리킬 래퍼런스 변수의 선언이 필요함.     
  ex) Circle pizza; //래퍼런스 변수 pizza 선언  
  2. new 연산자로 객체 생성 ex)pizza = new Circle(); //Circle 객체 생성  
  Circle pizza = new Circle(); // 래퍼런스 변수 pizza의 선언과 동시에 객체 생성  
  3. 객체 멤버 접근 ex) 객체레퍼런스.멤버  
4.3 생성자  
O 생성자의 개념과 목적 - 생성자는 객체가 생성될 때 초기화를 위해 실행되는 메소드이다.    
  생성자의 특징 - 1. 생성자의 이름은 클래스 이름과 동일하다.    
                 2. 생성자를 여러개 작성할 수 있다.   
                 ex) public class Circle {
                        public Circle() {...} //매개변수 없는 생성자
                        public Circle(int r, String n) {...} //2개의 매개 변수를 가진 생성자
                 }  
                 3. 생성자는 객체를 생성할 때 한번만 호출된다.  
                 ex) Circle pizza = new Circle(10, "자바피자"); //생성자 Circle(int r,String n)호출
                     Circle dount = new Circle();  
                 4. 생성자에 리턴 타입을 지정할 수 없다.   ex) public Circle() {...}  
                 ex) public void Circle() {...} // void를 리턴 타입으로 사용할 수 없음.  
                 5. 생성자의 목적은 객체가 생성될 때, 필요한 초기 작업을 위함이다.        
O 기본 생성자 - 매개변수가 없고 또한 실행 코드가 없어 아무일도 하지 않고 단순 리턴하는 생성자이다. 디폴트 생성자라고도 부른다.   ex) class Circle {
                                public Circle() { }
                              }   
 --기본 생성자가 자동으로 생성되는 경우 - 생성자가 없는 클래스는 있을 수 없으며, 클래스에 생성자가 하나도 선언되어 있지 않은 경우, 컴파일러는 기본 생성자를 자동으로 생성한다.     
 --기본 생성자가 자동으로 생성되지 않은 경우 - 생성자가 하나라도 존재하는 클래스에는 컴파일러가 기본 생성자를 임의로 삽입해 주지 않는다.   ex) Circle pizza = new Circle(10); // Circle(int r) 호출   
 O this 래퍼런스 - 객체 자신에 대한 래퍼런스로서 메소드 안에서 사용됨. 컴파일러에 의해 자동 관리되므로 개발자는 사용하기만 하면 된다.  
 O this()로 다른 생성자 호출 - 클래스 내에서 생성자가 다른 생성자를 호출할 때 사용하는 자바코드이다.  
 4.4 객체 배열  
 O 객체 배열 - 자바에서 객체를 원소로 하는 배열을 만들 수 있다. C/C++의 객체 배열과 달리 자바의 객체 배열은 객체에 대한 래퍼런스를 원소로 갖는 배열이며 만드는 방법 또한 다르다.  
 O 배열 선언 및 생성 - 객체 배열을 만들기 위해서는 3단계가 필요함  
        1. 배열에 대한 래퍼런스 선언  
        2. 래퍼런스 배열 생성  
        3. 객체 생성  
O 배열의 원소 객체 접근 - 배열 c의 i번째 객체를 접근하기 위해서는 c[i] 래퍼런스를 사용한다.  
4.5 메소드 활용과 객체 치환  
O 메소드 형식 - 자바의 메소드는 클래스의 멤버 함수로서 접근 지정자를 선언한다는 점 외에 C/C++ 함수의 작성법과 동일하다.  
 o 접근 지정자 - 자바에서 메소드는 반드시 접근 지정자와 함께 선언되어야 한다. 접근 지정자는 'public','private','protected'가 있으며, 접근 지정자가 생략된 '디폴트 접근 지정'의 경우 동일한 패키지 내의 모든 클래스에서 호출 가능하다.  
 o 리턴 타입 - 메소드가 호출자에게 리턴할 값의 타입이다.getSum()은 int 타입의 sum을 리턴하기 때문에 리턴 타입을 int로 선언하였다. 메소드가 아무 값도 리턴하지 않는다면 void 타입으로 선언한다.  
O 인자 전달 - 자바의 메소드 호출 시 인자 전달 방식은 '값에 의한 호출'이다. 호출하는 실인자의 값이 복사되어 메소드의 매개 변수에 전달된다.  
 o 기본 타입의 값이 전달되는 경우 - 매개 변수가 byte, char, int, double 등 기본 타입으로 선언되는 경우, 호출자가 건네는 값이 메소드의 매개 변수에 복사되어 전달한다.  
 o 객체가 전달되는 경우 - 메소드의 매개변수가 클래스 타입인 경우, 객체가 아니라 객체의 래퍼런스 값이 전달된다.  
 o 배열이 전달되는 경우 - 객체가 전달되는 경우와 동일하게. 배열이 통째로 전달되는 것이 아니라 배열에 대한 래퍼런스만 전달된다.  
O 메소드 오버로딩 - 자바 클래스 내에 이름이 같지만 매개 변수의 타입이나 개수가 서로 다른 여러 개의 메소드를 작성할 수 있다. 이것을 "메소드 오버로딩 혹은 메소드 중복" 이라고 부른다. 메소드 오버로딩은 다형성 의 한 종류이다.    
 - 메소드 오버로딩 성립을 위한 두 가지 조건 :   1. 메소드 이름 동일   2.메소드 매개 변수의 개수나 타입이 서로 달라야 함.  
O 객체 치환 시 주의할 점 - 객체를 복사하는 것이 아님.    
4.6 객체의 소멸과 가비지 컬렉션  
O 객체의 소멸 - new에 의해 할당받은 객체와 배열 메모리를 자바 가상 기계뢰 되돌려 주는 행위 , 소멸된 객체 공간은 가용 메모리에 포함  
O 자바에서 사용자 임의로 객체 소멸 안됨 : 자바는 객체 소멸 연산자가 없음   
O 객체 소멸은 자바 가상 기계의 고유한 역할  
O 자바 개발자에게는 매우 다행스러운 기능    
O 가비지 - 할당받은 객체나 배열 메모리 중에서 더 이상 사용하지 않게 된 메모리를 가비지 라고 부른다. 자바 플랫폼은 참조하는 래퍼런스가 하나도 없는 객체나 배열을 가비지로 판단한다  
O 가비지 컬렉션 - 가용 메모리 공간이 일정 크기 이하로 줄어들면, 자바 가상 기계는 자동으로 가비지를 회수하여 가용 메모리 공간을 늘린다.  
ex) System 또는 Runtime 객체의 gc() 메소드를 호출하여, 자바 플랫폼에 가비지 컬렉션을 요청할 수 있다.  
4.7 접근 지정자  
O 자바 패키지 개념   
 -- 패키지 : 상호 관련 있는 클래스 파일을 저장하여 관리하는 디렉터리 , 자바는 하나 이상의 패키지로 구성  
O 접근 지정자 - 대부분 객체지향언어에는 접근지정자를 두고 있다. 클래스나 멤버들을 다른 클래스에 접근해도 되는지의 여부를 선언하는 지시어이다.  
ex)자바의 4가지접근지정자 : private,protected,public  
O 클래스 접근 지정 - 클래스를 작성할 때 다른 클래스가 사용해도 되는지 허용 여부를 지정해야함.  
 o public 클래스 - 클래스 이름 앞에 public으로 선언된 클래스로써, 패키지에 상관없이 다른 어떤 클래스에게도 사용이 허용됨.  
 o 디폴트 클래스 - 접근 지정자 없이 클래스를 선언한 경우, 디폴트는 접근지정으로 선언되었다고한다.  
O 멤버 접근 지정 - 멤버에 대한 공개의 범위 private < 디폴트 < protected < public  
 o public 멤버 - public 선언된 것으로, 패키지를 막론하고 모든 클래스들이 접근 가능  
 o private 멤버 - 비공개를 의미하는 것으로 클래스 내의 멤버들에게만 접근이 허용된다.  
 o protected 멤버 - 보호된 공개를 의미, 두가지 클래스에만 공개한다. 첫째, 같은 패키지 내의 모든 클래스에서 접근이 가능하다. 둘째, 다른 패키지에 있더라도 자식 클래스의 경우 접근이 허용된다.  
 o 디폴트 멤버 - 접근지정자가 생략된 멤버의 경우,디폴트 멤버라고 한다. 동일한 패키지 내에 있는 클래스들만 디폴트 멤버를 자유롭게 접근할 수 있다.  
 4.8 static 멤버  
 O static 멤버 선언 - 클래스의 멤버들 중 다음과 같이 static 지시어로 선언된 멤버를 static 멤버 라고 부른다.  
  o static 멤버의 특성 - 클래스가 하나만 생성되는 멤버, 동일한 클래스의 모든 객체들이 공유하므로 클래스 멤버라고 부른다. 반면 non-static멤버는 각 객체마다 별도로 생기므로 인스턴스 멤버라고 부른다.                 



## 3월 29일 강의
타입 변환 - 변수나 상수 혹은 리터럴을 다른 타입으로 변환하는 것을 말한다.  
O 자동 타입 변환  - 치환문(=)이나 수식 내에서 타입이 일치하지 않을 때, 컴파일러는 작은 타입을 큰 타입으로 자동 변환한다.  
O 강제 타입 변환  - 캐스팅(casting)이라고 부름.  
강제 타입 변환의 에시 int n = 300; byte b = n;(X) byte b = (byte)n; (o)  

자바의 키 입력
O System.in - 표준 입력 스트림 객체,키 값을 바이트 정보로 바꾸어 제공하는 저수준 스트림 객체  
O Scanner를 이용한 키 입력  
o scanner 객체 생성 - Scanner scanner = new Scanner(System.in);
O import문 필요 - scanner를 사용하기 위해서는 프로그램의 맨 앞줄에 import문이 필요함  
예시 - import java.util.Scanner;  
O Scanner 스트림 닫기 - scanner.close();
  
연산자 - 주어진 식을 계산하여 결과를 얻어내는 과정을 연산이라고 한다.  
O 산술 연산 - 더하기,빼기,곱하기,나누기,나머지 5개이며 /는 몫을 구하며 %는 나머지를 구한다.  
O 증감 연산 - ++,-- 두 가지이며, 피연산자의 앞 또는 뒤에 붙어 값을 1 증가시키거나 1 감소시킨다.  
O 대입 연산 - 오른쪽 식의 결과를 왼쪽에 있는 변수에 대입한다.  
대입 연산의 예 int a = 1,b = 3;  a = b; a += b;  a=6 , b는 3 그대로  
O 비교연산 - 두 개의 피연산자를 비교하여 true 또는 false의 논리 결과를 내는 연산자  
O 조건연산 - 세 개의 피연산자로 구성되어 삼항(ternary) 연산자 라고 불리며 condition ? opr2 : opr3 
condition이 true 이면 opr2의 값이, false 이면 opr3의 값이 된다.  
O 비트 연산,시프트 연산 - 비트연산은 비트끼리 AND, OR, XOR, NOT 연산을 하는 비트논리연산, 비트를 오른쪽 왼쪽으로 이동시키는 비트 시프트 연산이 있다.  
시프트 연산 역시 각 비트들을 대상으로 연산이 이루어지며 3개의 연산자가 있으며 float, double, boolean데이터는 시프트 연산을 할 수 없다.

조건문   
O 단순 IF문 - 조건식은 비교연산이나 논리 연산의 혼합된 식으로 구성되며 결과는 불린 값이다. 조건식이 참이면 IF 내부의 실행 문장이 실행되며ㅡ 거짓이면 IF문을 벗어난다.  
O if-else 문 - if의 조건식이 참인 경우와 거짓인 경우에 실행할 문장을 각각 지시한다. 조건식이 true이면 실행문장 1을 행한 후 if-else문을 벗어나고, false이면 실행문장 2를 실행한 후 if-else문을 벗어난다.  
(다중 if-else문은 if-else가 연속되는 것이다.)  
O 중첩 if-else문 - if문이나 if-else문, 혹은 else문의 '실행 문장'에 if문이나 if-else문을 내포할 수 있다.   
O switch 문 - 값에 따라 여러 방향으로 분기하는 경우, if 문보다 switch 문을 사용하면 가독성이 높은 좋은 코드를 작성할 수 있다. 

반복문
O for 문 - 작업문은 for문이 반복되는 동안 매번 실행되며, 작업문이 하나의 문장인 경우 중괄호({})가 필요 없다. 초기문에서는 대개 for문의 조건식에서 사용하는 변수를 초기화한다. 조건식에는 논리 변수나 논리 연산을 사용하며, 조건식의 결과가 true인 경우에 반복이 계속되고 false가 되면 for문을 벗어난다.  
O while 문 - 조건식은 for문과 동일하다. true인 경우 반복이 게속되며, false인 경우 while문을 벗어난다. for문과 달리 조건식이 없으면 컴파일 오류가 발생한다.  
O do-while 문 - 조건식은 while문과 동일하며, 조건식이 없으면 컴파일 오류가 발생. 다른 반복문과 달리 작업문 실행 후 반복 조건을 따지므로 작업문이 최초 한번은 반드시 실행된다.  
O 중첩 반복 - 반복문 안에 다른 반복문을 만들 수 있다. for문 안에 for문 이나 while 문을 만들 수도 있고,while 문 안에 for,while,do - while 문을 둘 수 있다.
O continue 문과 break 문 - 반복문과 함께 사용되면서 반복의 흐름을 바꾸거나, 반복에서 벗어나게 하는 중요한 기능을 한다. continue 문은 반복문을 빠져나가지 않으면서 즉시 다음 반복으로 넘어가고자할 때 사용됨 break문은 하나의 반복문을 즉시 벗어날 때 사용함.

배열  - 인덱스와 인덱스에 대응하는 일련의 데이터들로 이루어진 연속적인 자료구조로서, 배열에는 같은 종류의 데이터들이 순차적으로 저장된다. 10개의 정수 값을 합할 때, 10개의 변수를 사용한 경우와 자바 배열을 사용한 경우를 대조하여 보여준다.  
배열 선언 및 생성 - 자바에서 배열을 생성하는 방법은 C/C++와 달리 래퍼런스 변수 선언과 배열 생성의 단계가 필요하며, 5개의 정수 배열을 만드는 과정을 보여줌.   
배열 선언문 - int intArray[];  
O 배열 생성 - 배열 공간을 할당받는 과정. 반드시 new연산자를 이용하여 배열을 생성하며 []안에 생성할 원소 개수를 지정한다. int intArray = new int[5]; 다음과 같이 배열 선언과 생성을 동시에 할 수도 있다.  
O 배열 초기화 - '{}' 사이에 원소를 나열하여 초기화된 배열을 만들 수 있다.
O 배열 인덱스와 배열 원소 접근 - 배열의 인덱스는 정수만 가능하며, 인덱스는 0부터 시작하고 마지막 원소의 인덱스는 [배열 크기-1] 이다. 
O 래퍼런스 치환과 배열 공유 - 배열 공간과 레퍼런스 변수가 분리되어 있기 때문에 생성된 배열에 대한 공유가 쉽게 이루어진다. 즉 생성된 배열을 다수의 래퍼런스가 참조 할 수 있다.  
O 배열의 크기, length필드 - 자바는 배열을 객체로 다룬다. 배열이 생성되면 배열 공간과 함께 배열의 크기 값을 가진 length필드가 배열 객체 내에 생성된다. length 필드를 이용하면 프로그램에서 배열의 크기를 따로 관리할 필요가 없다.  
O 배열과 for-each문 - for 문을 변형한 for-each문은 배열이나 나열의 크기만큼 루프를 돌면서, 각 원소를 순차적으로 접근하는데 매우 유용하다.



## 3월 22일 강의
자바 프로젝트 및 클래스 생성 하는 방법 그리고 소스 편집 컴파일 및 실행 하는 방법을 배웠다.  

자바 응용프로그램의 종류 - 데스크톱 응용프로그램,자바 서블릿 응용프로그램 등이 있으며 모바일 응용프로그램이 있다  

자바의 특징 - 플랫폼 독립성 , 객체지향 , 클래스로 캡슐화 , 소스와 클래스 파일 , 실행코드배포 , 패키지 , 멀티스레드 등등이 있다.  

자바프로그램의 구조 - 클래스, 주석문, 메소드, main()메소드, 메소드호출, 변수, 화면출력 으로 구성되어 있다.  

식별자 - 클래스, 변수, 상수, 메소드에 붙이는 이름을 말한다.  
        식별자로 한글을 사용할 수 있으며, 첫번째 문자는 숫자를 사용할 수 없고 대소문자를 구별한다.  


## 3월 15일 강의
10:00 ~ 11:50 깃 허브 주소를 복사하여 vscode에 붙여넣기 하고 깃허브를 활용하는 방법을 배웠다.
              SOURCE CONTROL 에서 내용을 넣고 commit을 누르고 업로드를 하면 나의 깃허브 주소에 내가 
              vs code에서 작성한 내용이 올라가게 되는 방식이다.

12:00 ~ 12:50 java 개발 환경 구축   
              openJDK 설치 - 설치가 오래 걸려 설치 하다가 끝남
              Eclips 설치 - 설치하였으나 교수님께서는 VSCODE를 사용하여 수업을 진행하심.  
              Eclips에 openJDK 연결 - Eclips와 JDK를 연결하여 eclips를 통해 테스트 완료  
              자바 프로젝트 생성 - 자바에서 텍스트를 출력하는 방법을 간단하게 배웠다.

