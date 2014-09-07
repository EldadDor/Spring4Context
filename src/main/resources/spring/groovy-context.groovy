package spring


beans {
    xmlns context: "http://www.springframework.org/schema/context"
    context.'component-scan'('base-package': "com.spring.context.model.aerialbots")

    fileCapsule(FileCapsuleImpl) { bean ->
        bean.factoryMethod = "getInstance"
        bean.singleton = false;
    }
}