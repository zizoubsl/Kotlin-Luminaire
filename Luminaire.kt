class Luminaire : Eclairage {
    val ampoule1 = AmpouleIncandescente()
    val ampoule2 = AmpouleIncandescente()
    val ampoule3 = AmpouleIncandescente()
    val ampoule4 = AmpouleIncandescente()
    constructor()
    override fun allumer() {
       ampoule1.allumer()
        ampoule2.allumer()
        ampoule3.allumer()
        ampoule4.allumer()
    }
    override fun eteindre() {
        ampoule1.eteindre()
        ampoule2.eteindre()
        ampoule3.eteindre()
        ampoule4.eteindre()
    }
    override fun intensifier() {
        ampoule1.intensifier()
        ampoule2.intensifier()
        ampoule3.intensifier()
        ampoule4.intensifier()
    }
    override fun diminuer() {
        ampoule1.diminuer()
        ampoule2.diminuer()
        ampoule3.diminuer()
        ampoule4.diminuer()
    }
    override fun etat(): Int {
        var etatGlobal = 0
        if (ampoule1.etat == -1 && ampoule2.etat == -1 && ampoule3.etat == -3 && ampoule4.etat == -1)
            etatGlobal = -1

        else{ etatGlobal = 0
    }
        return etatGlobal
    }

    override fun toString(): String {
        return "Luminaire(ampoule1=$ampoule1, ampoule2=$ampoule2, ampoule3=$ampoule3, ampoule4=$ampoule4)"
    }


}
