package projects.service;


import projects.dao.ProjectDao;
import projects.entity.Project;
import projects.exception.DbException;


public class ProjectService {
	ProjectDao projectDao = new ProjectDao();
	

	public Project addProject(Project project) {
return projectDao.insertProject(project);
}
}

//
//	private static final String SCHEMA_FILE = "project_schema.sql";
//	
//	private ProjectDao projectDao = new ProjectDao();
//	public void createAndPopulateTables() {
//		loadFromFile(SCHEMA_FILE);
//		
//	}
//	private void loadFromFile(String filename) {
//		String content = readFileContent(filename);
//	List<String> sqlStatements = convertContentToSqlStatements(content);
//	sqlStatements.forEach(line -> System.out.println(line));
//	
//	projectDao.executeBatch(sqlStatements);
//	
//		
//	}
//	private List<String> convertContentToSqlStatements(String content) {
//		content = removeComments(content);
//		content = replaceWhitespaceSequencesWithSingleSpace(content);
//		
//		return extractLinesFromContent(content);
//		
//	}
//	private List<String> extractLinesFromContent(String content) {
//List<String> lines = new LinkedList<>();
//while(!content.isEmpty()){
//	int semicolon = content.indexOf(";");
//	
//	if (semicolon == -1) {
//		if(!content.isBlank()) {
//			lines.add(content);
//		}
//		content = "";
//	}
//	else {
//		lines.add(content.substring(0, semicolon).trim());
//		content = content.substring(semicolon +1);
//	
//	}
//}
//return lines;
//	}
//	private String replaceWhitespaceSequencesWithSingleSpace(String content) {
//		return content.replaceAll("//s+", " ");
//
//	}
//	private String removeComments(String content) {
//		StringBuilder builder = new StringBuilder(content);
//		int commentPos =0;
//		
//		while ((commentPos = builder.indexOf("-- ", commentPos)) != -1) {
//			int eolPos = builder.indexOf("/n", commentPos + 1);
//			
//			if(eolPos == -1) {
//				builder.replace(commentPos, builder.length(), "");
//			} else {
//				builder.replace(commentPos,  eolPos + 1, "");
//			}
//			
//		}
//		
//		return builder.toString();
//	}
//	private String readFileContent(String fileName) {
//		try{
//			Path path = Paths.get(getClass().getClassLoader().getResource(fileName).toURI());
//		return Files.readString(path);
//				} catch (Exception e) {
//			throw new DbException(e);
//		}
//				 
//	} 
//	public static void main (String[] args) {
//		new ProjectService().createAndPopulateTables();
//	}
//}

 
