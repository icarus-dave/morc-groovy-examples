@Grab(group='nz.ac.auckland.morc',module='morc',version='1.8.0')
import nz.ac.auckland.morc.MorcTestBuilder
import nz.ac.auckland.morc.morc

morc.run(new MorcTestBuilder() {
    public void configure() {
        syncTest("Simple Echo Test", "http://echo.jsontest.com/foo/baz")
                .expectedResponseBody(json('{ "foo":"baz" }'))
    }
})
