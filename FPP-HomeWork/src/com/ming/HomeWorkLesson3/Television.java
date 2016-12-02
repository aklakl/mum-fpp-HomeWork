package com.ming.HomeWorkLesson3;


/**
 * 
 * @author  Ming Li  
 * @Student No  985579
 * @date Nov 30,2016
 * 
 */

public class Television {

	
	private int SCREEN_SIZE;
	private boolean powerOn = false;
	private int channel = 0;
	private int volume = 0;
	private String MANUFACTURER;
	
	private int[] rangeChannel = {0,200};
	private int[] rangeVolume  = {0,200};
	
	public Television() {
		// TODO Auto-generated constructor stub
		this("default",200);
	}
	

	public Television(String brand,int size){
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
	}
	
	public void setChannel(int station){
		if (powerOn){
			if  (station>=rangeChannel[0] && station<=rangeChannel[1] ){
				this.channel = station;
				System.out.println(this.MANUFACTURER+" setChannel successed");
			}else{
				System.out.println(this.MANUFACTURER+"| you set the Channel:"+station+" out of the range");
			}
		}else{
			System.out.println(this.MANUFACTURER+" is powerOFF");
		}
	}
	
	public void power(){
		if (powerOn){
			powerOn = false;
			System.out.println(this.MANUFACTURER+" is powerOFF");
		}else{
			powerOn = true;
			System.out.println(this.MANUFACTURER+" is powerON");
		}
	}
	
	public void increaseVolume(){
		if (powerOn){
			if  (this.volume>=rangeVolume[0] && this.volume<=rangeVolume[1] ){
				this.volume++;
				System.out.println(this.MANUFACTURER+ "'s Volume is"+this.volume);
			}else{
				System.out.println(this.MANUFACTURER+"| the volume is:"+this.volume+" out of the range");
			}
		}else{
			System.out.println(this.MANUFACTURER+" is powerOFF, you can't increaseVolume");
		}
	}
	
	public void decreaseVolume(){
		if (powerOn) {
			this.volume--;
			System.out.println(this.MANUFACTURER+ "'s Volume is"+this.volume);
		}else{
			System.out.println(this.MANUFACTURER+" is powerOFF, you can't decreaseVolume");
		}
	}
	
	public int getChannel(){
		System.out.println(this.MANUFACTURER+ "'s Channel is"+this.channel);
		return  this.channel;
	}
	
	public int getVolume(){
		System.out.println(this.MANUFACTURER+ "'s Volume is"+this.volume);
		return this.volume;
	}
	
	public String getManufacturer(){
		System.out.println( "the Television Brand is"+this.MANUFACTURER);
		return this.MANUFACTURER;
	}
	
	public int getScreenSize(){
		System.out.println(this.MANUFACTURER+ "'s Screen size is"+this.SCREEN_SIZE);
		return this.SCREEN_SIZE;
	}

	
	
	public static void main(String[] args) {
		//test for question 1
		Television television = new Television("LG-TV",500);
		
		television.increaseVolume();
		
		television.power();
		
		television.setChannel(10);
		
		television.getChannel();
		
		television.increaseVolume();
		
		television.decreaseVolume();
		
		television.getManufacturer();

		television.getScreenSize();
		
		television.getVolume();
		
		
		
		 
	}
	
	
	 
	
	 
	
	
	public static int getRandom() {
        int number = 0;
        while (true) {
            number = (int) (Math.random() * 1000);
            if (number >= 100 && number < 1000) {
                break;
            }
        }
        return number;
    }


}
