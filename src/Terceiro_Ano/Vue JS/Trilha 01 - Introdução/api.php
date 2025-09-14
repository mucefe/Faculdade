<?php


$host = "127.0.0.1";          
$dbname = "produtos_api";     
$username = "root";           
$password = "root";           

header("Content-Type: application/json; charset=UTF-8");
header("Access-Control-Allow-Origin: *");

try {
    
    $conn = new PDO("mysql:host=$host;dbname=$dbname;charset=utf8", $username, $password);
    $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    http_response_code(500);
    echo json_encode(["erro" => "Falha na conexão com o banco: " . $e->getMessage()]);
    exit;
}


$method = $_SERVER['REQUEST_METHOD'];
$uri = $_SERVER['REQUEST_URI'];


if ($method === 'GET' && preg_match('/\/produtos$/', $uri)) {
    try {
        
        $stmt = $conn->query("SELECT id, nome, descricao, preco FROM produtos");
        $produtos = $stmt->fetchAll(PDO::FETCH_ASSOC);

        echo json_encode($produtos, JSON_UNESCAPED_UNICODE | JSON_PRETTY_PRINT);
    } catch (PDOException $e) {
        http_response_code(500);
        echo json_encode(["erro" => "Erro ao buscar produtos: " . $e->getMessage()]);
    }
} else {
    http_response_code(404);
    echo json_encode(["erro" => "Endpoint não encontrado."]);
}
