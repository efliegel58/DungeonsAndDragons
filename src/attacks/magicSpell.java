package attacks;

public class magicSpell extends Attack
{public int use(int roll, int atk) 
{
		int damage = 0;
		switch (roll)
		{
		case 1: case 2: case 3: case 4:
			damage = 0 + atk; break;
		case 5: case 6: case 7: case 8:
			damage = 1 + atk; break;
		case 9: case 10: case 11: case 12:
			damage = 2 + atk; break;
		case 13: case 14: case 15: case 16:
			damage = 3 + atk; break;
		case 17: case 18: case 19: case 20:
			damage = 4 + atk; break;
		}
		return damage;
	}
@Override
public String getName() {
	// TODO Auto-generated method stub
	return "Magic Spell";
}}
