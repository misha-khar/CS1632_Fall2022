package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class DeathStarTest {

	/**
	 * Write an integration test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetIntegration() {
		// TODO: Fill in!
		DeathStar ds = new DeathStar();
		Planet pl = new Planet(10);
		String retStr = ds.shoot(pl);

		assertEquals("Wimpy planet was hit by the superlaser!", retStr);
		assertEquals(-90, pl.getHitPoints());
		// fail();
	}

	/**
	 * Write an unit test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetUnit() {
		// TODO: Fill in!

		DeathStar ds = new DeathStar();
		Planet pl = Mockito.mock(Planet.class);
		
		Mockito.when(pl.toString()).thenReturn("Wimpy planet");
		String retStr = ds.shoot(pl);

		assertEquals("Wimpy planet was hit by the superlaser!", retStr);
		Mockito.verify(pl).damage(100);

		// fail();
	}
}
