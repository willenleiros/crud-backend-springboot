package br.com.leiros.api.crudbasico;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("br.com.leiros.api.crudbasico")
@IncludeClassNamePatterns({"^.*ATests?$"})
class CrudbasicoApplicationTests {
}
