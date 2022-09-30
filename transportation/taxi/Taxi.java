package transportation.taxi;

import transportation.Transportation;

public class Taxi extends Transportation {
     int _Total=0;
     int _MaxPeople=4;
     int _InPeople=0;
     int _confirmPay=0;
     int _AmountFuel=100;
     String _Status="일반";
    int _BasicPay=3000;
    int _CurrentSpeed=0;
    //텍시 몇갠지
    public void TransportationNum(int nums) {
        for(int i=0; i<nums;i++){
            System.out.println("bus num : "+_TransportationNum());
        }
        System.out.println("주류량 = " + _AmountFuel);
        System.out.println("상태 = "+_Status);
    }
    public void Current(int i){
            _InPeople+=i;
            System.out.println("탑승 승객 수 = "+_InPeople);
            _MaxPeople-=i;
            System.out.println("잔여 승객수 = "+(_MaxPeople));
    }
    public void AmountFuel(int i) {
        if(_AmountFuel+(i)<=10){
            _AmountFuel+=(i);
            _MaxPeople=4;
            _InPeople=0;
            Status("운행불가");
            System.out.println("주유량 = "+_AmountFuel);
            System.out.println(_Status);
            _Total+=_confirmPay;
            System.out.println(_Total);
            if(_AmountFuel<10) System.out.println("DANGER !! 주유가 필요합니다!!");
        }else {
            _AmountFuel += (i);
            System.out.println(_AmountFuel);
            Charge();
            _InPeople=0;
            System.out.println("누적요금 = "+_confirmPay);
            _Total+=_confirmPay;
            _confirmPay=0;
        }
    }


    public void Status(String i) {
        _Status=i;
        System.out.println(_Status);
    }
    //손님 탑승
    public void ridding(int i,String j, String f){
        if(_InPeople+i>4) System.out.println("승객수 초과 됬스요 !!!!!!");
        else {
            Current(i);
            System.out.println("기본요금 확인="+_BasicPay);
            System.out.println("목적지 = " + j);
            int pay = Integer.parseInt(f.substring(0,f.length()-2));
            System.out.println("목적지까지 거리 =" + f);
            _confirmPay=_BasicPay+(pay-1)*1000;
            System.out.println("지불할 요금 = " +(_BasicPay+(pay-1)*1000));
            _Status = "운행중";
            Status(_Status);
        }
        _Status="일반";
    }
    public void Charge(){

    }
    public void CurrentSpeed(int i) {
        if(_AmountFuel<10){
            System.out.println("주유량을 확인해주세요");
            _CurrentSpeed=0;
        }else{ _CurrentSpeed+=(i);
            System.out.println("스피드 : "+_CurrentSpeed);
        }
    }
}
