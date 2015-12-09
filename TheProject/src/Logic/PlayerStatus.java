package Logic;

import javax.swing.JPanel;

import Main.Config;

public class PlayerStatus extends JPanel{
	private static final long serialVersionUID = 1L;
	private int hp, mp, exp, score;
	private int level;
	private boolean isPause = false, isDestroyed;
	private boolean isShielded;
	private static final int MAX_SCORE = 10000, MIN_SCORE = 0, MAX_P = 100, MIN_P = 0;
	private Player owner;
	
	public PlayerStatus(int hp, int mp, int exp){
		this.hp = hp;
		this.mp = mp;
		this.exp = exp;
		this.isShielded = false;
		
		owner = new Player(Config.SCREEN_WIDTH/2, Config.SCREEN_HEIGHT/2,10); // assume speed = 10
		
		score = MIN_SCORE;
		isDestroyed = false;
		
		level = 0;
		
		// TODO Draw the statusBar
	}
	
	public boolean isOnStatusBar(int x,int y){
		return y>=0 && y<= Config.SCREEN_HEIGHT && x>=0 && x<= Config.SCREEN_WIDTH;
	}
	
	public void increaseScore(int increase){
		score += increase;
		System.out.println("PLAYER score: "+score);
		if(score >= MAX_SCORE) score = MAX_SCORE;
	}
	
	public void increaseHP(int increase){
		hp += increase;
		if(hp >= MAX_P) hp = MAX_P;
	}
	
	public void decreaseHP(int decrease){
		System.out.println("DECREASEHP!!!: "+decrease);
		hp -= decrease;
		if(hp <= MIN_P) hp = MIN_P;
		System.out.println("total HP = "+hp);
	}
	
	public void increaseMP(int increase){
		mp += increase;
		if(mp >= MAX_P) mp = MAX_P;
		checkMPstatus();
	}
	
	public void decreaseMP(int decrease){
		mp -= decrease;
		if(mp <= MIN_P) mp = MIN_P;
		checkMPstatus();
	}
	
	public void checkMPstatus(){
		if(mp <= 15) owner.setBulletType(1);
		else if(mp <= 70) owner.setBulletType(2);
		else if(mp <= MAX_P) owner.setBulletType(3);
	}
	
	public void increaseEXP(int increase){
		exp += increase;
		if(exp >= MAX_P) exp = MAX_P;
	}
	
	public void decreaseEXP(int decrease){
		exp -= decrease;
		if(exp <= MIN_P) exp = MIN_P;
	}
	
	public void checkIsAlive(){
		if(hp <= MIN_P) isDestroyed = true;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}

	public boolean isPause() {
		return isPause;
	}

	public void setPause(boolean isPause) {
		this.isPause = isPause;
	}

	public Player getOwner() {
		return owner;
	}

	public boolean isShielded() {
		return isShielded;
	}

	public void setShielded(boolean isShielded) {
		this.isShielded = isShielded;
	}
	
}
