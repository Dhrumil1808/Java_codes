package Lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShootOut {

	List<Cowboy> cb = new ArrayList<Cowboy>();
	Random r = new Random();

	public static void main(String[] args) {
		ShootOut shoot = new ShootOut();
		shoot.battle();
	}

	public void battle() {
		Marshall marshalls = new Marshall("Wyatt Earp", 0.9 + (0.1 * r.nextDouble()));
		for (int i = 0; i < 5; i++) {
			Cowboy cbs = new Cowboy(0.5 * r.nextDouble());
			cb.add(cbs);
		}
		int present = 0;
		while (marshalls.isAlive() && cb.size() > 0) {
			if(present<cb.size())
			{
			if (cb.get(present).isAlive()) {
				cb.get(present).shoot(marshalls);
				
				if (marshalls.isAlive())
					marshalls.shoot(cb.get(present));
				
				if (!cb.get(present).isAlive())
					cb.remove(present);
				present++;
			}
			}
			else
			{
				present = present % cb.size();
			}
		}
		if (marshalls.isAlive()) {
			System.out.println(marshalls.getName() + " has won!");
		} else {
			System.out.println("Cowboys have won");
		}
	}

}
