package org.jboss.resteasy.test.providers.jackson2.whitelist.model.sea;

import org.jboss.resteasy.test.providers.jackson2.whitelist.model.AbstractVehicle;

public class Watercraft extends AbstractVehicle {
    private int knots;
    private int draft;

    public Watercraft() {
        super("Watercraft");
    }

    public int getKnots() {
        return knots;
    }

    public void setKnots(int knots) {
        this.knots = knots;
    }

    public int getDraft() {
        return draft;
    }

    public void setDraft(int draft) {
        this.draft = draft;
    }

    public String toString() {
        return String.format("%s knots: %d draft: %d", super.toString(), knots, draft);
    }

}
