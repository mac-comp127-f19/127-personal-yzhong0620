package extractInterface;

public class FireballAttack implements Attack {
    private final int fireballDamage;
    private final int fireballManaRequired;

    public FireballAttack(int fireballDamage,int fireballManaRequired){
        this.fireballDamage=fireballDamage;
        this.fireballManaRequired=fireballManaRequired;
    }

    @Override
    public String Attack(GameCharacter player, GameCharacter target){
        if (player.useMana(fireballManaRequired)) {
            target.takeDamage(fireballDamage);
            return player.getName() + " hit " + target.getName() + " with a fireball for "
                    + fireballDamage + " points of damage";
        } else {
            return player.getName() + " did not have enough mana for a fireball attack";
        }
    }
}

