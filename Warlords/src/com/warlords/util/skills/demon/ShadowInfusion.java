package com.warlords.util.skills.demon;

import org.bukkit.entity.Player;

public class ShadowInfusion {
	private double dur;
	private double maxdur;
	private Player p;
	private double speed;
	public ShadowInfusion(double dur,Player p, double speed){
		this.dur=dur*20;
		this.maxdur=dur*20;
		this.p=p;
		this.speed=speed;
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
	public double getMaxDuration() {
		return maxdur;
	}
	public double getBoost() {
		return speed;
	}
}