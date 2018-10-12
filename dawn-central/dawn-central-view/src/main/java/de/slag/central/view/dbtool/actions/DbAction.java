package de.slag.central.view.dbtool.actions;

import de.slag.base.Labelable;

public interface DbAction extends Labelable {

	boolean isDone();

	boolean isErrors();

	void run();

	String getErrorText();

}
