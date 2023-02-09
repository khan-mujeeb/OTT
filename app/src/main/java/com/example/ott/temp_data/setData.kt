package com.example.netflixuiclone.data

object setData {
    fun movieList(): List<MovieData> {
        var list = mutableListOf<MovieData>()

        list.add(
            MovieData(

                1,
                "The Batman",
                "Acton/Crime/Drama",
                "2022",
                "2h 56m",
                "Matt Reeves",
                "When a sadistic serial killer begins murdering key political figures in Gotham, Batman is forced to investigate the city's hidden corruption and question his family's involvement.",
                "https://www.themoviedb.org/t/p/original/seyWFgGInaLqW7nOZvu0ZC95rtx.jpg"
            )
        )

        list.add(
            MovieData(
                2,
                "Morbius",
                "Action/Adventure",
                "2022",
                "1h44m",
                "Daniel Espinosa",
                "Biochemist Michael Morbius tries to cure himself of a rare blood disease, but he inadvertently infects himself with a form of vampirism instead.",
                "https://www.themoviedb.org/t/p/original/6JjfSchsU6daXk2AKX8EEBjO3Fm.jpg"
            )
        )

        list.add(
            MovieData(
                3,
                "Dual",
                "comedy, drama",
                "2022",
                "length",
                "Riley Stearns",
                "A woman opts for a cloning procedure after she receives a terminal diagnosis but when she recovers her attempts to have her clone decommissioned fail, leading to a court-mandated",
                "https://www.themoviedb.org/t/p/original/wDEse2TQRiyfhdlusSXBdkDOQRj.jpg"
            )
        )

        list.add(
            MovieData(
                4,
                "Prometheus",
                "Adventure/Mystery/Sci-Fi",
                "2013",
                "2h 4m",
                "Ridley Scott",
                "Following clues to the origin of mankind, a team finds a structure on a distant moon, but they soon realize they are not alone.",
                "https://www.fabioemme.it/wp-content/uploads/2022/02/Prometheus-And-Alien-Covenant-The-Colossal-Terror-Sequel-Never-Comes.jpg",
            )
        )

        list.add(
            MovieData(
                5,
                "Gravity",
                "Drama/Sci-Fi",
                "2013",
                "1h 31m",
                "Alfonso Cuarón",
                "Two astronauts work together to survive after an accident leaves them stranded in space.",
                "https://mir-s3-cdn-cf.behance.net/project_modules/disp/a41b4b11636617.560fb0d69096d.jpg",
            )
        )

        list.add(
            MovieData(
                6,
                "Avengers: Endgame",
                "Action/Adventure",
                "2019",
                "3h 1m",
                "Anthony RussoJoe/Russo",
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' action...",
                "https://lumiere-a.akamaihd.net/v1/images/p_avengersendgame_19751_e14a0104.jpeg",
            )
        )

        list.add(
            MovieData(
                7,
                "Black Widow",
                "Adventure/Mystery/Sci-Fi",
                "2021",
                "2h 14m",
                "Cate Shortland",
                "Natasha Romanoff confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSxnnpUHDu-N4JFDV1rTDX6gOoSFFYYAwaWZYi4oF5_sgq7afv",
            )
        )

        list.add(
            MovieData(
                8,
                "Avatar: The Way of Water",
                "Action/Adventure/Fantasy",
                "2022",
                "3h 12m",
                "James Cameron",
                "Jake Sully lives with his newfound family formed on the extrasolar moon Pandora. Once a familiar threat returns to finish what was previously started, Jake must work with Neytiri and the arm... ",
                "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSmGggtpJ4TX3aN3PUaVWUgNODHespRPvKYAyhGUAZSqSOmPiEm",
            )
        )

        list.add(
            MovieData(
                9,
                "Shang-Chi",
                "Action/Adventure/Fantasy",
                "2021",
                "2h 12m",
                "Destin Daniel Cretton",
                "Shang-Chi, the master of weaponry-based Kung Fu, is forced to confront his past after being drawn into the Ten Rings organization.",
                "https://wallpapercave.com/wp/wp9740594.jpg",
            )
        )
//
//        list.add(
//            MovieData(
//                4,
//                "",
//                "",
//                "",
//                "",
//                "",
//                "",
//                "",
//            )
//        )



        return list
    }
}