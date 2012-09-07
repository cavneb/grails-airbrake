class UrlMappings {

	static mappings = {
        "/airbrakeTest"(controller: 'airbrakeTest', action: 'edit')

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
