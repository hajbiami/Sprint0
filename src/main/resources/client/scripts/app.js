(function() {
	'use strict';
	var app = angular.module(
			'app',
			[ 'ngRoute', 'ngAnimate', 'ui.bootstrap', 'easypiechart',
					'mgo-angular-wizard', 'textAngular', 'ui.tree',
					'ngTagsInput']).config(
			[ '$routeProvider', function($routeProvider,$urlRouterProvider) {
				$routeProvider
				.when('/formations',{
					templateUrl : '../views/indexFormation.html',
					controller : 'FormationCtrl'
					
				})
				.when('/afficherFormation/:code',{
					templateUrl : 'views/afficherFormation.html',
					controller : 'AfficherFormationCtrl'
				})
				.when('/ajouterFormation',{
					templateUrl : '../views/ajouterFormation.html',
					controller : 'AjouterFormationCtrl'
				})
				.when('/supprimerFormation/:code',{
					templateUrl : '../views/supprimerFormation.html',
					controller : 'SupprimerFormationCtrl'
				})
				.when('/modifierFormation/:code',{
					templateUrl : '../views/modifierFormation.html',
					controller : 'ModifierFormationCtrl'
				})
				.when('/authentification',{
					templateUrl : 'views/authentification.html'
				})
				
				.otherwise({
					redirectTo : '/'
				});
				
			} ]
    );

}).call(this);