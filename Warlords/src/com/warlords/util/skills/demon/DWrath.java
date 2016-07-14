package com.warlords.util.skills.demon;

import org.bukkit.entity.Player;

public class DWrath {
	private double dur;
	private Player p;
	private double r;
	private int count;
	private int eps;
	public DWrath(double dur,Player p,double r,int count, int epsboost){
		this.dur=dur*20;
		this.p=p;
		this.r=r;
		this.count=count;
		this.eps=epsboost;
	}
	public double getDuration(){
		return dur;
	}
	public Player getPlayer(){
		return p;
	}
	public void decreaseDuration() {
		dur--;
	}
	public double getRad() {
		return r;
	}
	public int getCount() {
		return count;
	}
	public int getEPS() {
		return eps;
	}
}
