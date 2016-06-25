module.exports = function(grunt) {
 
    // Project configuration.
    grunt.initConfig({
 
        //Read the package.json (optional)
        pkg: grunt.file.readJSON('package.json'),
 
        // Metadata.
        meta: {
            basePath: '../',
            srcPath: '../components/**/',
            deployPath: '../components/'
        },
 
        banner: '/*! <%= pkg.name %> - v<%= pkg.version %> - ' +
                '<%= grunt.template.today("yyyy-mm-dd") %>\n' +
                '* Copyright (c) <%= grunt.template.today("yyyy") %> ',
 
        // Task configuration.
        sass: {
            dist: {
                files: {
					'../app.css':'../app.scss',
                    '<%= meta.deployPath %>home/home.css': '<%= meta.srcPath %>home.scss',
					'<%= meta.deployPath %>login/login.css': '<%= meta.srcPath %>login.scss',
					'<%= meta.deployPath %>header-page/header-page.css': '<%= meta.srcPath %>header-page.scss'
                }
            }
        },
 
        watch: {
            scripts: {
                files: [
                    '<%= meta.srcPath %>**/*.scss',
					'../*.scss'
                ],
                tasks: ['sass']
            }
        }
 
    });
 
    // These plugins provide necessary tasks.
    grunt.loadNpmTasks('grunt-contrib-sass');
    grunt.loadNpmTasks('grunt-contrib-watch');
 
    // Default task.
    grunt.registerTask('default', ['sass']);
};