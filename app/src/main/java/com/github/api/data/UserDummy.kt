package com.github.api.data

object UserDummy {
    val list: ArrayList<User>
    get(){
        val list = arrayListOf<User>()
        list.add(User(
            "adithyaric",
            "https://avatars1.githubusercontent.com/u/69343456?v=4",
            "https://api.github.com/users/adithyaric",
            "https://api.github.com/users/adithyaric/followers",
            10,
            "https://api.github.com/users/adithyaric/following{/other_user}",
            15,
            "https://api.github.com/users/adithyaric/repos",
            10
        ))
        list.add(User(
            "adithyaric2",
            "https://avatars1.githubusercontent.com/u/69343456?v=4",
            "https://api.github.com/users/adithyaric",
            "https://api.github.com/users/adithyaric/followers",
            10,
            "https://api.github.com/users/adithyaric/following{/other_user}",
            15,
            "https://api.github.com/users/adithyaric/repos",
            10
        ))
        list.add(User(
            "adithyaric3",
            "https://avatars1.githubusercontent.com/u/69343456?v=4",
            "https://api.github.com/users/adithyaric",
            "https://api.github.com/users/adithyaric/followers",
            10,
            "https://api.github.com/users/adithyaric/following{/other_user}",
            15,
            "https://api.github.com/users/adithyaric/repos",
            10
        ))
        list.add(User(
            "adithyaric4",
            "https://avatars1.githubusercontent.com/u/69343456?v=4",
            "https://api.github.com/users/adithyaric",
            "https://api.github.com/users/adithyaric/followers",
            10,
            "https://api.github.com/users/adithyaric/following{/other_user}",
            15,
            "https://api.github.com/users/adithyaric/repos",
            10
        ))
        list.add(User(
            "adithyaric5",
            "https://avatars1.githubusercontent.com/u/69343456?v=4",
            "https://api.github.com/users/adithyaric",
            "https://api.github.com/users/adithyaric/followers",
            10,
            "https://api.github.com/users/adithyaric/following{/other_user}",
            15,
            "https://api.github.com/users/adithyaric/repos",
            10
        ))

        return list
    }
}