job("Build and push Docker") {
    docker {
        build {
            context = "docker"
            file = "./Dockerfile"
            labels["vendor"] = "TFG"
        }

        push("mycompany.registry.jetbrains.space/p/mp/mydocker/myimage") {
            tags("version1.0")
        }
    }
}