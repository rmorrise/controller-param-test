package controller.param.test

class BootStrap {

    def init = { servletContext ->
		def test = new Test(name: 'Test');
		test.save(validate: true, failOnError:true);
    }
    def destroy = {
    }
}
