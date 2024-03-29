class AmpouleLed: Eclairage {
    /**
     * etat de la lampe : 0 éteinte, 10 allumée pleine intensité
     */
    var etat = 0
    /**
     * Constructeur
     */
    fun AmpouleIncandescente() {
        this.etat = 0
    }
    /**
     * Calcule la probabilité qu'une ampoule tombe en panne
     *
     * @return 0 l'ampoule fonctionne, -1 l'ampoule est en panne
     */
    private fun probaPanne(): Int {
        val alea = (0..100).random() // generated random from 0 to 100 included
        return if (alea < 1) {
            -1
        } else 0
    }
    /**
     * Allume l'ampoule à pleine puissance, on vérifie que l'ampoule
     * que l'ampoule fonctionne encore et que la probabilité de panne
     * ne retourne pas -1
     */
    override fun allumer() {
        if (this.etat != -1 && this.probaPanne() != -1) {
            this.etat = 10;
        } else {
            this.etat = -1;
        }
    }
    /**
     * Eteint l'ampoule, on vérifie que l'ampoule n'est pas en panne
     * si c'est le cas on passe son état à 0
     */
    override fun eteindre() {
        if (this.etat != -1) {
            this.etat = 0;
        }
    }
    /**
     * Augmente l'intensité lumineuse de l'ampoule, on vérifie que
     * l'ampoule n'est pas en panné et que son intensité est < à 10
     */
    override fun intensifier() {
        if ( this.etat < 10) {
            this.etat++;
        }
    }
    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    override fun diminuer() {
        if ( this.etat > 0) {
            this.etat--;
        }
    }
    /**
     * Permet de connaître l'état de l'ampoule
     *
     * @return l'état de la lampe 0..10 ou -1 si en panne
     */
    override fun etat(): Int = this.etat
    /**
     * @return l'état de l'objet sous la forme d'une chaîne de caractères
     */
    override fun toString(): String {
        return this.javaClass.name + " : " + this.etat
    }
}