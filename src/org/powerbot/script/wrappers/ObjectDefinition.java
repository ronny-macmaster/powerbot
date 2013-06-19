package org.powerbot.script.wrappers;

import org.powerbot.client.RSObjectDef;

import java.lang.ref.WeakReference;

class ObjectDefinition {
	private final WeakReference<RSObjectDef> definition;

	ObjectDefinition(final RSObjectDef definition) {
		this.definition = new WeakReference<>(definition);
	}

	int getId() {//TODO use or remove??
		final RSObjectDef def = this.definition.get();
		return def != null ? def.getID() : -1;
	}

	String getName() {
		final RSObjectDef def = this.definition.get();
		String name = "";
		if (def != null && (name = def.getName()) == null) name = "";
		return name;
	}

	String[] getActions() {
		final RSObjectDef def = this.definition.get();
		String[] actions = new String[0];
		if (def != null && (actions = def.getActions()) == null) actions = new String[0];
		return actions;
	}
}