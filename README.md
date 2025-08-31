# Internato - CRUD completo (Spring Data REST + PostgreSQL + Lombok)

Projeto completo com as entidades do MER: Usuario, Aluno, PeriodoAcademico, SemestreLetivo,
Especialidade, LocalParceiro, LocalEspecialidade, PeriodoAcademicoEspecialidade, Rodizio,
RodizioAluno e Checkin.

## Como rodar
1. Ajuste as credenciais do banco em `src/main/resources/application.properties`.
2. Tenha PostgreSQL rodando e crie o banco `internato_db` (ou permita que a conexão o crie dependendo das permissões).
3. Execute:
   ```bash
   mvn spring-boot:run
   ```

## Endpoints (exemplos)
- `GET /usuarios`
- `POST /usuarios`
- `GET /alunos`
- `POST /alunos`
- `GET /rodizios`
- `POST /rodizioAlunos`
- `POST /checkins`

Spring Data REST gera os endpoints automaticamente para cada repositório.
