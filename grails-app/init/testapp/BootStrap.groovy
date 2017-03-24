package testapp

class BootStrap {

    def init = { servletContext ->

        def user = new User(username: 'test', password: 'test')
        assert user.springSecurityService != null

    }
    def destroy = {
    }
}
