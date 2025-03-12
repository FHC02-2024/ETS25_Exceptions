package org.campus02.raumschiff;

public class Transporter {

    public void beam(String person,
                     String from,
                     String to,
                     boolean urgent) throws TransporterMalfunctionException {

        if (urgent && Math.random() < 0.5) {
            throw new TransporterMalfunctionException("Person " + person + " konnte nicht gebeamt werden");
        }

        System.out.println(person + " wurde erfolgreich von " + from + " nach " + to + " gebeamt");
    }

    public void shutdown() {
        System.out.println("Transporter sicher heruntergefahren");
    }
}
