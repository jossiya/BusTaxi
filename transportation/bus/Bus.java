package transportation.bus;

import transportation.Transportation;

public class Bus extends Transportation {
    int _MaxPeople=30;//최대 승객수
    int _InPeople=0;
    int _confirmPay=0;
    int _AmountFuel=100;
    String Status="운행중";
    int _CurrentSpeed=0;
    public  void TransportationNum(int nums) {
//버스 몇 댄지
       for(int i=0; i<nums;i++){
           System.out.println("bus num : "+_TransportationNum());
       }
    }
    //버스 승객 상태
    public void Current(int i){
        if(_InPeople+i>30) System.out.println("더 이상 못타요 !!!!!!");
        else {_InPeople+=i;
            System.out.println("탑승 승객 수 = "+_InPeople);
            _MaxPeople-=i;
            System.out.println("잔여 승객수 = "+(_MaxPeople));
            _confirmPay+=i*1000;
            System.out.println("요금 확인 = " +_confirmPay);}
    }
//주유량
    public void AmountFuel(int i) {
        if(_AmountFuel+(i)<=10){
            _AmountFuel+=(i);
            Status="차고지행";
            _MaxPeople=30;
            _InPeople=0;
            _confirmPay=0;
            System.out.println("주유량 = "+_AmountFuel);
            System.out.println(Status);
            if(_AmountFuel<10) System.out.println("DANGER !! 주유가 필요합니다!!");
        }else{
            _AmountFuel+=(i);
            System.out.println(_AmountFuel);
        }
    }
    //상태
    public void Status(String i){
        if(i.equals("운행불가")){
            Status="운행불가";
            _MaxPeople=30;
            _InPeople=0;
            _confirmPay=0;
            System.out.println(Status);
        }else if(i.equals("운행중")) {
            Status="운행중";
            System.out.println(Status);
        }else System.out.println("입력값을 정해진대로 입혁하기 바래유");
    }
    //버스 스피드 조절
    public void CurrentSpeed(int i) {
        if(_AmountFuel<10){
            System.out.println("주유량을 확인해주세요");
            _CurrentSpeed=0;
        }else{ _CurrentSpeed+=(i);
            System.out.println("스피드 : "+_CurrentSpeed);}
    }
}
