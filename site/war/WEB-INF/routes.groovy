// example routes
/*
get "/blog/@year/@month/@day/@title", forward: "/WEB-INF/groovy/blog.groovy?year=@year&month=@month&day=@day&title=@title"
get "/something", redirect: "/blog/2008/10/20/something", cache: 2.hours
get "/book/isbn/@isbn", forward: "/WEB-INF/groovy/book.groovy?isbn=@isbn", validate: { isbn ==~ /\d{9}(\d|X)/ }
*/

// routes for the blobstore service example
get "/@version/@gameid/@endpoint/@method", forward: "/api-@version/@endpoint/@method.groovy?gameid=@gameid"
get "/@version/@gameid/@endpoint", forward: "/api-@version/@endpoint/index.groovy?gameid=@gameid"
