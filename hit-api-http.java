  // filter by brand;

        // pertama kita cari di core service
        // CloseableHttpClient httpClient = HttpClients.createDefault();
        // String baseUrl = "http://localhost:8080";
        // URI uri = URI.create(baseUrl + "/api/v1/core/backoffice/product/generateGroups");

        // HttpPost httpPost = new HttpPost(uri);

        // httpPost.setHeader("Content-Type", "application/json");
        // httpPost.setHeader("X-Consumer-Custom-ID", "{}");
        
        // ObjectMapper om = new ObjectMapper();
        // Map<String, Object> req = new HashMap<>();
        
        // req.put("brandIds", new ArrayList<>(List.of("115")));

        // StringEntity requestBody = new StringEntity(om.writeValueAsString(req));
        // httpPost.setEntity(requestBody);

        // HttpResponse httpResponse = httpClient.execute(httpPost);

        // HttpEntity entity = httpResponse.getEntity();

        // BufferedReader rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
        // StringBuilder content = new StringBuilder();
        // String line;
        // while((line = rd.readLine()) != null){
        //     content.append(line);
        // }
        // JsonObject result = new JsonObject(content.toString()).mapTo(JsonObject.class);
        // response.productIds = result.getJsonObject("productIds").toString();

        // return response;
