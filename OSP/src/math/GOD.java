package math;
import java.awt.Image;
public class GOD {
		
		private int clas;
		private int pos = 1;
		private double res = 5;
		private Image dvd;
		private int pow = 10;
		private int exp;
		private int zatratMana = 5;
		private int lvl = 1;
		private int hod = 1;
		private String name;
		private int edd;
		private int prihodpos = 10;
		private double prihodres = 2;
		private int prihodpow = 1; 
		private int prihodexp;
		
		private int counts = 0; //Shop
		private int counta = 0; //Altar
		private int countm = 0; //Statuja
		private int countsch = 0; //School
		private int countamf = 0; //Amfiteatr
		private int countpag = 0; //Pagoda
		private int countcirk = 0; //Cirk
		private int countfarm = 0; //Farm
		private int countrad = 0; //Radio
		private int countzav = 0; //Zavod
		private int lose = 0;
		
		private int count = 0; //ALL
		private int countmax = 2; //MaxCount
		
		private String pril; //Prilagatelnoe
		private String sush; //Sushestvitelnoe
		private String glag; //Glagol
		//obyasneniya
		private String opril; 
		private String osush; 
		private String oglag;
		//skills
		private String skill1;
		private String skill2;
		private String skill3;
 
		private int zatratmana;

		private int shtrav; //deistvie effecta v hodah
		private int bonusPos;
		private int bonusRes;
		
		private boolean stroy;
		private boolean zakl;

		public void SetClas(int clas){this.clas = clas;}
		public int GetClas(){return clas;}
		
		public void SetPos(int pos){this.pos = pos;}
		public int GetPos(){return pos;}
		
		public void SetRes(double res){this.res = res;}
		public double GetRes(){return res;}
		
		public void SetDvd(Image dvd){this.dvd = dvd;}
		public Image GetDvd(){return dvd;}
		
		public void SetPow(int pow){this.pow = pow;}
		public int GetPow(){return pow;}
		
		public void SetExp(int exp){this.exp = exp;}
		public int GetExp(){return exp;}
		
		public void SetZatratMana(int dgr){this.zatratMana = dgr;}
		public int GetZatratMana(){return zatratMana;}
		
		public void SetLvl(int lvl){this.lvl = lvl;}
		public int GetLvl(){return lvl;}
		
		public void SetHod(int hod){this.hod = hod;}
		public int GetHod(){return hod;}
		
		public void SetName(String name){this.name = name;}
		public String GetName(){return name;}
		
		public void SetEdd(int edd){this.edd = edd;}
		public int GetEdd(){return edd;}
		
		public void SetPrihodPos(int prihodpos){this.prihodpos = prihodpos;}
		public int GetPrihodPos(){return prihodpos;}
		
		public void SetPrihodRes(double prihodres){this.prihodres = prihodres;}
		public double GetPrihodRes(){return prihodres;}
		
		public void SetPrihodPow(int prihodpow){this.prihodpow = prihodpow;}
		public int GetPrihodPow(){return prihodpow;}
		
		public void SetPrihodExp(int prihodexp){this.prihodexp = prihodexp;}
		public int GetPrihodExp(){return prihodexp;}
		
		//Postroiki
		//Shop
		public void SetCountS(int counts){this.counts = counts;}
		public int GetCountS(){return counts;}
		//Altar
		public void SetCountA(int counta){this.counta = counta;}
		public int GetCountA(){return counta;}
		//Statuya
		public void SetCountM(int countm){this.countm = countm;}
		public int GetCountM(){return countm;}
		//School
		public void SetCountSch(int countsch){this.countsch = countsch;}
		public int GetCountSch(){return countsch;}
		//Amfiteatr
		public void SetCountAmf(int countamf){this.countamf = countamf;}
		public int GetCountAmf(){return countamf;}
		//Pagoda
		public void SetCountPag(int countpag){this.countpag = countpag;}
		public int GetCountPag(){return countpag;}
		//Cirk
		public void SetCountCirk(int countcirk){this.countcirk = countcirk;}
		public int GetCountCirk(){return countcirk;}
		//Farm
		public void SetCountFarm(int countfarm){this.countfarm = countfarm;}
		public int GetCountFarm(){return countfarm;}
		//Radio
		public void SetCountRadio(int countrad){this.countrad = countrad;}
		public int GetCountRadio(){return countrad;}
		//Zavod
		public void SetCountZavod(int countzav){this.countzav = countzav;}
		public int GetCountZavod(){return countzav;}
		//ALL
		public void SetCountAll(int count){this.count = count;}
		public int GetCountAll(){return count;}
		//MaxCount
		public void SetCountMax(int countmax){this.countmax = countmax;}
		public int GetCountMax(){return countmax;}
		//stroil ili ne stroili
		public void SetStroy(boolean stroy){this.stroy = stroy;}
		public boolean GetStroy(){return stroy;}
		//koldovali ili ne koldovali
		public void SetZakl(boolean zakl){this.zakl = zakl;}
		public boolean GetZakl(){return zakl;}
	
		//Magic
		public void SetPril(String pril){this.pril = pril;}
		public String GetPril(){return pril;}
		
		public void SetSush(String sush){this.sush = sush;}
		public String GetSush(){return sush;}
		
		public void SetGlag(String glag){this.glag = glag;}
		public String GetGlag(){return glag;}
		
		public void SetOPril(String opril){this.opril = opril;}
		public String GetOPril(){return opril;}
		
		public void SetOSush(String osush){this.osush = osush;}
		public String GetOSush(){return osush;}
		
		public void SetOGlag(String oglag){this.oglag = oglag;}
		public String GetOGlag(){return oglag;}	

		public void SetShtrav(int shtrav){this.shtrav = shtrav;}
		public int GetShtrav(){return shtrav;}
		
		public void SetSkill1(String skill1){this.skill1 = skill1;}
		public String GetSkill1(){return skill1;}
		
		public void SetSkill2(String skill2){this.skill2 = skill2;}
		public String GetSkill2(){return skill2;}
		
		public void SetSkill3(String skill3){this.skill3 = skill3;}
		public String GetSkill3(){return skill3;}
		
		public void SetLose(int lose){this.lose = lose;}
		public int GetLose(){return lose;}
		
		public void SetBonusPos(int bonusPos){this.bonusPos = bonusPos;}
		public int GetBonusPos(){return bonusPos;}
		
		public void SetBonusRes(int bonusRes){this.res = bonusRes;}
		public int GetBonusRes(){return bonusRes;}
		
	}


