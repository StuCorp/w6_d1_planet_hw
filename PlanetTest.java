import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before; 

public class PlanetTest{

 
Planet planet; 

@Before
public void before(){
  planet = new Planet("Bear planet", 100);
}

@Test 
public void hasName(){
  assertEquals("Bear planet", planet.getName());
}

@Test
public void hasSize(){
  assertEquals(100, planet.getSize());
}

@Test
public void hasExplode(){
  assertEquals("Boom! Bear planet has exploded.", planet.explode());
}



}