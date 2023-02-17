class EnchantedRoom extends Room {
	private Spell spell = null;

	public EnchantedRoom(int roomNo){
 		super(roomNo);
 	}

 	public EnchantedRoom(int number, Spell spell){
 		super(number);
 		this.spell = spell;
 	}
}