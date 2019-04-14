module com.jwebmp.plugins.ionic.ionicons {
	exports com.jwebmp.plugins.ionic.ionicons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;
	requires net.sf.uadetector.core;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.ionic.ionicons.IonIconsPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.ionic.ionicons.implementations.IonIconsExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.ionic.ionicons.implementations.IonIconsExclusionsModule;

	opens com.jwebmp.plugins.ionic.ionicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}