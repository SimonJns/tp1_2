enum class Sex {
    MALE, FEMALE
}

data class Etudiant(
    val name: String,
    val code: String,
    val age: Int,
    val sex: Sex,
    val adresse: String
)

val etudiants = mutableListOf(
    Etudiant(
        name = "Simon",
        code = "simon64",
        sex = Sex.MALE,
        adresse = "834.Ustaritz",
        age = 24,
    ),
    Etudiant(
        name = "Bernard",
        code = "bernardtest",
        sex = Sex.MALE,
        adresse = "15.Bayonne",
        age = 22,
    ),
    Etudiant(
        name = "Natasha",
        code = "nathboss",
        sex = Sex.FEMALE,
        adresse = "17.Biarritz",
        age = 25,
    ),
    Etudiant(
        name = "Macha",
        code = "ouijl",
        sex = Sex.FEMALE,
        adresse = "26.Bidart",
        age = 20,
    ),
    Etudiant(
        name = "Jean-paul",
        code = "jpbg",
        sex = Sex.MALE,
        adresse = "19.Bassusary",
        age = 26,
    ),
    Etudiant(
        name = "Federer",
        code = "goat",
        sex = Sex.MALE,
        adresse = "31.Bayonne",
        age = 19,
    ),
    Etudiant(
        name = "Marine",
        code = "marineoui",
        sex = Sex.FEMALE,
        adresse = "14.Anglet",
        age = 25,
    ),
    Etudiant(
        name = "Jean",
        code = "jeannot",
        sex = Sex.MALE,
        adresse = "455.Biarritz",
        age = 26,
    ),
    Etudiant(
        name = "Xavier",
        code = "THICC",
        sex = Sex.MALE,
        adresse = "15.Paris",
        age = 29,
    ),
    Etudiant(
        name = "mimi",
        code = "bg",
        sex = Sex.MALE,
        adresse = "15.Bruxelle",
        age = 24,
    )
)

etudiants.sortBy { it.age }
for (e in etudiants) {
    println(e.name)
}

etudiants.sortByDescending { it.age }
for (e in etudiants) {
    println(e.name)
}

var etudiantsSortBySex = etudiants.groupBy { it.sex }
var etudiantsMale = etudiantsSortBySex.get(Sex.MALE)
var etudiantsFemale = etudiantsSortBySex.get(Sex.FEMALE)

var i: Int = 0
while (etudiants[i].sex != Sex.MALE) {
    i++
}


var listeNom = mutableListOf<String>()
for (e in etudiants) {
    listeNom.add(e.name)
}
for (e in listeNom) {
    println(e)
}

var sexToRemove: Sex = Sex.MALE
etudiants.removeIf {it.sex == sexToRemove}
for (e in etudiants) {
    println(e.name)
}


etudiants.clear()