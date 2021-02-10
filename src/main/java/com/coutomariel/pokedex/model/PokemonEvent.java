package com.coutomariel.pokedex.model;

public class PokemonEvent {

    private Long eventId;
    private String eventType;

    public PokemonEvent(Long eventId, String eventType) {
        this.eventId = eventId;
        this.eventType = eventType;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "PokemonEvent{" +
                "eventId=" + eventId +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PokemonEvent)) return false;

        PokemonEvent that = (PokemonEvent) o;

        if (getEventId() != null ? !getEventId().equals(that.getEventId()) : that.getEventId() != null) return false;
        return getEventType() != null ? getEventType().equals(that.getEventType()) : that.getEventType() == null;
    }

    @Override
    public int hashCode() {
        int result = getEventId() != null ? getEventId().hashCode() : 0;
        result = 31 * result + (getEventType() != null ? getEventType().hashCode() : 0);
        return result;
    }

    public PokemonEvent() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
