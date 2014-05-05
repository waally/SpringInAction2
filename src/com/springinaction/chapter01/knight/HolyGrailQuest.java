package com.springinaction.chapter01.knight;

public class HolyGrailQuest implements Quest {

	@Override
	public Object embark() throws QuestFailedException {
		return new HolyGrail();
	}

}
