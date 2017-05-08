/**
 * 
 */
package pets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ltt19
 *
 */
public class PetTest {
	private GameEnvironment game;
	private Pet pet;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		game = new GameEnvironment(1, 1);
		pet = new Pet("doggo", GameEnvironment.speciesAvailable[0]);
		}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		game = null;
		pet = null;
	}

	/**
	 * Test method for {@link pets.Pet#feed(pets.Food)}.
	 */
	@Test
	public void testFeedDogNotFavFoodMeanLevels(){
		Food f = GameEnvironment.foodAvailable[0];
		pet.setHungerLevel(50);
		pet.setToiletLevel(50);
		pet.setMood(50);
		pet.setWeight(pet.getPetSpecies().getOriginalWeight());
		pet.setActions(1);
		pet.setDailyScore(0);
		pet.feed(f);
		assertEquals("Hunger should equal 22", 22, pet.getHungerLevel());
		assertEquals("Toilet should equal 58", 58, pet.getToiletLevel());
		assertEquals("Mood should equal 77", 77, pet.getMood());
		assertEquals("Weight should equal 26.4", 26.4, pet.getWeight(), 1);
		assertEquals("Actions should equal 2", 2, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
	}

	@Test
	public void testFeedDogFavFoodMeanLevels(){
		Food f = GameEnvironment.foodAvailable[1];
		pet.setHungerLevel(50);
		pet.setToiletLevel(50);
		pet.setMood(50);
		pet.setWeight(pet.getPetSpecies().getOriginalWeight());
		pet.setActions(1);
		pet.setDailyScore(0);
		pet.feed(f);
		assertEquals("Hunger should equal 29", 29, pet.getHungerLevel());
		assertEquals("Toilet should equal 56", 56, pet.getToiletLevel());
		assertEquals("Mood should equal 92", 92, pet.getMood());
		assertEquals("Weight should equal 26.4", 26.4, pet.getWeight(), 1);
		assertEquals("Actions should equal 2", 2, pet.getActions());
		assertEquals("Daily Score should equal 50", 50, pet.getDailyScore());
	}
	
	@Test
	public void testFeedDogNotFavFoodMinLevels(){
		Food f = GameEnvironment.foodAvailable[0];
		pet.setHungerLevel(0);
		pet.setToiletLevel(0);
		pet.setMood(0);
		pet.setWeight(0);
		pet.setActions(0);
		pet.setDailyScore(0);
		pet.feed(f);
		assertEquals("Hunger should equal 0", 0, pet.getHungerLevel());
		assertEquals("Toilet should equal 8", 8, pet.getToiletLevel());
		assertEquals("Mood should equal 27", 27, pet.getMood());
		assertEquals("Weight should equal 0.1", 0.1, pet.getWeight(), 1);
		assertEquals("Actions should equal 1", 1, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
	}
	
	@Test
	public void testFeedDogFavFoodMinLevels(){
		Food f = GameEnvironment.foodAvailable[1];
		pet.setHungerLevel(0);
		pet.setTiredLevel(0);
		pet.setPlayfulLevel(0);
		pet.setToiletLevel(0);
		pet.setMood(0);
		pet.setWeight(0);
		pet.setActions(0);
		pet.feed(f);
		assertEquals("Hunger should equal 0", 0, pet.getHungerLevel());
		assertEquals("Toilet should equal 6", 6, pet.getToiletLevel());
		assertEquals("Mood should equal 42", 42, pet.getMood());
		assertEquals("Weight should equal 0.1", 0.1, pet.getWeight(), 1);
		assertEquals("Actions should equal 1", 1, pet.getActions());
		assertEquals("Daily Score should equal 50", 50, pet.getDailyScore());
	}
	
	@Test
	public void testFeedDogNotFavFoodMaxLevels(){
		Food f = GameEnvironment.foodAvailable[0];
		pet.setHungerLevel(100);
		pet.setToiletLevel(100);
		pet.setMood(100);
		pet.setWeight(100);
		pet.setActions(2);
		pet.setDailyScore(0);
		pet.feed(f);
		assertEquals("Hunger should equal 72", 72, pet.getHungerLevel());
		assertEquals("Toilet should equal 100", 100, pet.getToiletLevel());
		assertEquals("Mood should equal 100", 100, pet.getMood());
		assertEquals("Weight should equal 120", 120, pet.getWeight(), 1);
		assertEquals("Actions should equal 3", 3, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
	}
	
	@Test
	public void testFeedDogFavFoodMaxLevels(){
		Food f = GameEnvironment.foodAvailable[1];
		pet.setHungerLevel(100);
		pet.setToiletLevel(100);
		pet.setMood(100);
		pet.setWeight(100);
		pet.setActions(2);
		pet.setDailyScore(0);
		pet.feed(f);
		assertEquals("Hunger should equal 79", 79, pet.getHungerLevel());
		assertEquals("Toilet should equal 100", 100, pet.getToiletLevel());
		assertEquals("Mood should equal 100", 100, pet.getMood());
		assertEquals("Weight should equal 120", 120, pet.getWeight(), 1);
		assertEquals("Actions should equal 3", 3, pet.getActions());
		assertEquals("Daily Score should equal 50", 50, pet.getDailyScore());
	}
	
	@Test
	public void testFeedDogHighNutrition(){
		Food f = GameEnvironment.foodAvailable[5];
		pet.setToiletLevel(50);
		pet.feed(f);
		assertEquals("Toilet shoudl equal 92", 92, pet.getToiletLevel());
	}
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */

	/**
	 * Test method for {@link pets.Pet#sleep()}.
	 */
	@Test
	public void testSleepMean(){
		pet.setTiredLevel(50);
		pet.setActions(1);
		pet.sleep();
		assertEquals("Tired should equal 13", 13, pet.getTiredLevel());
		assertEquals("Actions should equal 2", 2, pet.getActions());
	}

	/**
	 * Test method for {@link pets.Pet#sleep()}.
	 */
	@Test
	public void testSleepMin(){
		pet.setTiredLevel(0);
		pet.setActions(0);
		pet.sleep();
		assertEquals("Tired should equal 0", 0, pet.getTiredLevel());
		assertEquals("Actions should equal 1", 1, pet.getActions());
	}
	
	/**
	 * Test method for {@link pets.Pet#sleep()}.
	 */
	@Test
	public void testSleepMax(){
		pet.setTiredLevel(100);
		pet.setActions(2);
		pet.sleep();
		assertEquals("Tired should equal 25", 25, pet.getTiredLevel());
		assertEquals("Actions should equal 3", 3, pet.getActions());
	}
	
	/**
	 * Test method for {@link pets.Pet#toilet()}.
	 */
	@Test
	public void testToiletMean() {
		pet.setActions(1);
		pet.setWeight(pet.getPetSpecies().getOriginalWeight());
		pet.setToiletLevel(50);
		pet.toilet();
		assertEquals("Actions should equal 2", 2, pet.getActions());
		assertEquals("Toilet should equal 13", 13, pet.getToiletLevel());
		assertEquals("Weight shoudl equal 18.7", 18.7, pet.getWeight(), 1);
	}
	
	/**
	 * Test method for {@link pets.Pet#toilet()}.
	 */
	@Test
	public void testToiletMin(){
		pet.setActions(0);
		pet.setWeight(0);
		pet.setToiletLevel(0);
		pet.toilet();
		assertEquals("Actions should equal 1", 1, pet.getActions());
		assertEquals("Toilet should equal 0", 0, pet.getToiletLevel());
		assertEquals("Weight shoudl equal 0", 0, pet.getWeight(), 1);
	}

	/**
	 * Test method for {@link pets.Pet#toilet()}.
	 */
	@Test
	public void testToiletMax(){
		pet.setActions(2);
		pet.setWeight(100);
		pet.setToiletLevel(100);
		pet.toilet();
		assertEquals("Actions should equal 3", 3, pet.getActions());
		assertEquals("Toilet should equal 25", 25, pet.getToiletLevel());
		assertEquals("Weight shoudl equal 85", 85, pet.getWeight(), 1);
	}
	
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */
	@Test
	public void testDogPlayFavToyMean(){
		Toy t = GameEnvironment.toysAvailable[0];
		pet.setActions(1);
		pet.setDailyScore(0);
		pet.setMood(50);
		pet.setPlayfulLevel(50);
		t.setToyQuality(50);
		t.setIsBroken(false);
		pet.setIsMisbehaving(false);
		pet.setHungerLevel(50);
		pet.setTiredLevel(50);
		boolean broken = pet.play(t);
		assertEquals("Actions should equal 2", 2, pet.getActions());
		assertEquals("Daily Score should equal 50", 50, pet.getDailyScore());
		assertEquals("Mood should equal 95", 95, pet.getMood());
		assertEquals("Playful should equal 5", 5, pet.getPlayfulLevel());
		assertEquals("Toy quality shoud equal 30", 30, t.getToyQuality());
		assertEquals("Hunger should equal 85", 85, pet.getHungerLevel());
		assertEquals("Tired should equal 85", 85, pet.getTiredLevel());
		assertFalse("Toy broken should be false", broken);
	}
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */
	@Test
	public void testDogPlayFavToyMin(){
		Toy t = GameEnvironment.toysAvailable[0];
		pet.setActions(0);
		pet.setDailyScore(0);
		pet.setMood(0);
		pet.setPlayfulLevel(0);
		t.setToyQuality(1);
		t.setIsBroken(false);
		pet.setIsMisbehaving(false);
		pet.setHungerLevel(0);
		pet.setTiredLevel(0);
		boolean broken = pet.play(t);
		assertEquals("Actions should equal 1", 1, pet.getActions());
		assertEquals("Daily Score should equal 50", 50, pet.getDailyScore());
		assertEquals("Mood should equal 45", 45, pet.getMood());
		assertEquals("Playful should equal 0", 0, pet.getPlayfulLevel());
		assertEquals("Toy quality shoud equal 0", 0, t.getToyQuality());
		assertEquals("Hunger should equal 35", 35, pet.getHungerLevel());
		assertEquals("Tired should equal 35", 35, pet.getTiredLevel());
		assertTrue("Toy broken should be true", broken);
	}
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */
	@Test
	public void testDogPlayFavToyMax(){
		Toy t = GameEnvironment.toysAvailable[0];
		pet.setActions(2);
		pet.setDailyScore(0);
		pet.setMood(100);
		pet.setPlayfulLevel(100);
		t.setToyQuality(100);
		t.setIsBroken(false);
		pet.setIsMisbehaving(false);
		pet.setHungerLevel(100);
		pet.setTiredLevel(100);
		boolean broken = pet.play(t);
		assertEquals("Actions should equal 3", 3, pet.getActions());
		assertEquals("Daily Score should equal 50", 50, pet.getDailyScore());
		assertEquals("Mood should equal 100", 100, pet.getMood());
		assertEquals("Playful should equal 55", 55, pet.getPlayfulLevel());
		assertEquals("Toy quality shoud equal 80", 80, t.getToyQuality());
		assertEquals("Hunger should equal 100", 100, pet.getHungerLevel());
		assertEquals("Tired should equal 100", 100, pet.getTiredLevel());
		assertFalse("Toy broken should be false", broken);
	}
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */
	@Test
	public void testDogPlayNotFavMean(){
		Toy t = GameEnvironment.toysAvailable[1];
		pet.setActions(1);
		pet.setDailyScore(0);
		pet.setMood(50);
		pet.setPlayfulLevel(50);
		t.setToyQuality(50);
		t.setIsBroken(false);
		pet.setIsMisbehaving(false);
		pet.setHungerLevel(50);
		pet.setTiredLevel(50);
		boolean broken = pet.play(t);
		assertEquals("Actions should equal 2", 2, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
		assertEquals("Mood should equal 80", 80, pet.getMood());
		assertEquals("Playful should equal 20", 20, pet.getPlayfulLevel());
		assertEquals("Toy quality shoud equal 30", 30, t.getToyQuality());
		assertEquals("Hunger should equal 70", 70, pet.getHungerLevel());
		assertEquals("Tired should equal 70", 70, pet.getTiredLevel());
		assertFalse("Toy broken should be false", broken);
	}
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */
	@Test
	public void testDogPlayNotFavMin(){
		Toy t = GameEnvironment.toysAvailable[1];
		pet.setActions(0);
		pet.setDailyScore(0);
		pet.setMood(0);
		pet.setPlayfulLevel(0);
		t.setToyQuality(1);
		t.setIsBroken(false);
		pet.setIsMisbehaving(false);
		pet.setHungerLevel(0);
		pet.setTiredLevel(0);
		boolean broken = pet.play(t);
		assertEquals("Actions should equal 1", 1, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
		assertEquals("Mood should equal 30", 30, pet.getMood());
		assertEquals("Playful should equal 0", 0, pet.getPlayfulLevel());
		assertEquals("Toy quality shoud equal 0", 0, t.getToyQuality());
		assertEquals("Hunger should equal 20", 20, pet.getHungerLevel());
		assertEquals("Tired should equal 20", 20, pet.getTiredLevel());
		assertTrue("Toy broken should be true", broken);
	}
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */
	@Test
	public void testDogPlayNotFavMax(){
		Toy t = GameEnvironment.toysAvailable[1];
		pet.setActions(2);
		pet.setDailyScore(0);
		pet.setMood(100);
		pet.setPlayfulLevel(100);
		t.setToyQuality(100);
		t.setIsBroken(false);
		pet.setIsMisbehaving(false);
		pet.setHungerLevel(100);
		pet.setTiredLevel(100);
		boolean broken = pet.play(t);
		assertEquals("Actions should equal 3", 3, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
		assertEquals("Mood should equal 100", 100, pet.getMood());
		assertEquals("Playful should equal 70", 70, pet.getPlayfulLevel());
		assertEquals("Toy quality shoud equal 80", 80, t.getToyQuality());
		assertEquals("Hunger should equal 100", 100, pet.getHungerLevel());
		assertEquals("Tired should equal 100", 100, pet.getTiredLevel());
		assertFalse("Toy broken should be false", broken);
	}
	/**
	 * Test method for {@link pets.Pet#play(pets.Toy)}.
	 */
	@Test
	public void testDogPlayMisbehaving(){
		Toy t = GameEnvironment.toysAvailable[0];
		pet.setIsMisbehaving(true);
		t.setToyQuality(100);
		t.setIsBroken(false);
		boolean broken = pet.play(t);
		assertEquals("Toy quality should equal 0", 0, t.getToyQuality());
		assertTrue("Toy broken should be true", broken);
	}
	
	/**
	 * Test method for {@link pets.Pet#dailyUpdateStats()}.
	 */
	@Test
	public void testDailyUpdateStatsPetDead(){
		pet.setIsAlive(false);
		pet.setHungerLevel(50);
		pet.dailyUpdateStats();
		assertEquals("Hunger Level should not change", 50, pet.getHungerLevel());
	}
	
	@Test
	public void testDailyUpdateStatsMean(){
		pet.setIsAlive(true);
		pet.setHungerLevel(50);
		pet.setTiredLevel(50);
		pet.setPlayfulLevel(50);
		pet.setToiletLevel(50);
		pet.setActions(1);
		pet.setDailyScore(250);
		pet.dailyUpdateStats();
		assertEquals("Hunger should equal 80", 80, pet.getHungerLevel());
		assertEquals("Tired should equal 60", 60, pet.getTiredLevel());
		assertEquals("Playful should equal 90", 90, pet.getPlayfulLevel());
		assertEquals("Toilet should equal 80", 80, pet.getToiletLevel());
		assertEquals("Actions should equal 0", 0, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
		
	}
	
	@Test
	public void testDailyUpdateStatsMin(){
		pet.setIsAlive(true);
		pet.setHungerLevel(0);
		pet.setTiredLevel(0);
		pet.setPlayfulLevel(0);
		pet.setToiletLevel(0);
		pet.setActions(0);
		pet.setDailyScore(0);
		pet.dailyUpdateStats();
		assertEquals("Hunger should equal 30", 30, pet.getHungerLevel());
		assertEquals("Tired should equal 10", 10, pet.getTiredLevel());
		assertEquals("Playful should equal 40", 40, pet.getPlayfulLevel());
		assertEquals("Toilet should equal 30", 30, pet.getToiletLevel());
		assertEquals("Actions should equal 0", 0, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
	}
	
	@Test
	public void testDailyUpdateStatsMax(){
		pet.setIsAlive(true);
		pet.setHungerLevel(100);
		pet.setTiredLevel(100);
		pet.setPlayfulLevel(100);
		pet.setToiletLevel(100);
		pet.setActions(2);
		pet.setDailyScore(1000);
		pet.dailyUpdateStats();
		assertEquals("Hunger should equal 100", 100, pet.getHungerLevel());
		assertEquals("Tired should equal 100", 100, pet.getTiredLevel());
		assertEquals("Playful should equal 100", 100, pet.getPlayfulLevel());
		assertEquals("Toilet should equal 100", 100, pet.getToiletLevel());
		assertEquals("Actions should equal 0", 0, pet.getActions());
		assertEquals("Daily Score should equal 0", 0, pet.getDailyScore());
	}

	/**
	 * Test method for {@link pets.Pet#calculatePetDailyScore()}.
	 */
	@Test
	public void testCalulateDailyScoreIfDead(){
		pet.setIsAlive(false);
		pet.setDailyScore(0);
		pet.calculatePetDailyScore();
		assertEquals("Daily Score should equal -100", -100, pet.getDailyScore());
	}
	
	@Test
	public void testCalculateDailyScoreIfMisbehavingMean(){
		pet.setIsAlive(true);
		pet.setDailyScore(100);
		pet.setIsMisbehaving(true);
		pet.setIsSick(false);
		pet.setHungerLevel(50);
		pet.setTiredLevel(50);
		pet.setPlayfulLevel(50);
		pet.setToiletLevel(50);
		pet.setMood(50);
		pet.calculatePetDailyScore();
		assertEquals("Daily Score should equal 225", 225, pet.getDailyScore());
;		
	}
	
	@Test
	public void testCalculateDailyScoreIfMisbehavingMin(){
		pet.setIsAlive(true);
		pet.setDailyScore(-100);
		pet.setIsMisbehaving(true);
		pet.setIsSick(false);
		pet.setHungerLevel(0);
		pet.setTiredLevel(0);
		pet.setPlayfulLevel(0);
		pet.setToiletLevel(0);
		pet.setMood(0);
		pet.calculatePetDailyScore();
		assertEquals("Daily Score should equal 150", 150, pet.getDailyScore());
	}
	
	@Test
	public void testCalculateDailyScoreIfMisbehavingMax(){
		pet.setIsAlive(true);
		pet.setDailyScore(1000);
		pet.setIsMisbehaving(true);
		pet.setIsSick(false);
		pet.setHungerLevel(100);
		pet.setTiredLevel(100);
		pet.setPlayfulLevel(100);
		pet.setToiletLevel(100);
		pet.setMood(100);
		pet.calculatePetDailyScore();
		assertEquals("Daily Score should equal 1000", 1000, pet.getDailyScore());
	}
	
	@Test
	public void testCaluculateDailyScoreSickAndMisbehavingMean(){
		pet.setIsAlive(true);
		pet.setDailyScore(100);
		pet.setIsMisbehaving(true);
		pet.setIsSick(true);
		pet.setHungerLevel(50);
		pet.setTiredLevel(50);
		pet.setPlayfulLevel(50);
		pet.setToiletLevel(50);
		pet.setMood(50);
		pet.calculatePetDailyScore();
		assertEquals("Daily Score should equal 125", 125, pet.getDailyScore());
		
	}

	/**
	 * Test method for {@link pets.Pet#shouldPetBeDead()}.
	 */
	@Test
	public void testShouldPetBeDeadOneFull(){
		pet.setIsAlive(true);
		pet.setHungerLevel(100);
		boolean dead = pet.shouldPetBeDead();
		assertTrue("Pet should be dead", dead);
	}
	
	@Test
	public void testShouldPetBeDeadMin(){
		pet.setIsAlive(true);
		pet.setHungerLevel(0);
		pet.setTiredLevel(0);
		pet.setToiletLevel(0);
		pet.setMood(5);
		boolean dead = pet.shouldPetBeDead();
		assertFalse("Pet should not be dead", dead);
	}
	
	@Test
	public void testShouldPetBeDeadMax(){
		pet.setIsAlive(true);
		pet.setHungerLevel(99);
		pet.setTiredLevel(99);
		pet.setToiletLevel(99);
		pet.setMood(99);
		boolean dead = pet.shouldPetBeDead();
		assertTrue("Pet should be dead", dead);
	}
	
	@Test
	public void testShouldPetBeDeadMean(){
		pet.setIsAlive(true);
		pet.setHungerLevel(99);
		pet.setTiredLevel(0);
		pet.setToiletLevel(0);
		pet.setMood(0);
		boolean dead = pet.shouldPetBeDead();
		assertTrue("Pet should be dead", dead);
	}
}
