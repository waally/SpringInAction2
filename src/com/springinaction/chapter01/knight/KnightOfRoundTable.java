package com.springinaction.chapter01.knight;

public class KnightOfRoundTable implements Knight{

	@SuppressWarnings("unused")
	private String name;
	
	private Quest quest;
	
	private KnightOfRoundTable(String name) {
		this.name = name;
	}

	@Override
	public Object embarkOnQuest() throws QuestFailedException {
		return quest.embark();
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}
	
}
